package com.tz3.waitHasParamMethod;

/**
 * create by tz on 2018-04-12
 */
public class MyRunnable {
    private static Object   lock      = new Object();
    private static Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin time = " + System.currentTimeMillis());
                    lock.wait(3000);
                    System.out.println("wait   end time = " + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    private static Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin time = " + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify   end time = " + System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(runnable1);

        t1.start();
        Thread.sleep(1000);

        Thread t2 = new Thread(runnable2);

        t2.start();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
