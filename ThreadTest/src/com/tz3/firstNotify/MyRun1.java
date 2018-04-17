package com.tz3.firstNotify;

/**
 * create by tz on 2018-04-13
 */
public class MyRun1 {
    private String lock = new String("");
    private boolean isFirstRunB = false;
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    while (!isFirstRunB) {
                        System.out.println("begin wait");
                        lock.wait();
                        System.out.println("end wait");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end   notify");
                isFirstRunB = true;
            }

        }
    };

    public static void main(String[] args) throws InterruptedException {
        MyRun1 run = new MyRun1();
        Thread b = new Thread(run.runnableB);
        b.start();
        Thread.sleep(100);
        Thread a = new Thread(run.runnableA);
        a.start();

//        MyRun1 run = new MyRun1();
//        Thread a = new Thread(run.runnableA);
//        a.start();
//        Thread.sleep(100);
//        Thread b = new Thread(run.runnableB);
//        b.start();

    }
}
