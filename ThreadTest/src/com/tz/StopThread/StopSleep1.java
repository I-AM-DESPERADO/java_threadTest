package com.tz.StopThread;

/**
 * create by tz on 2018-03-18
 */
public class StopSleep1 extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run-begin");
            Thread.sleep(200000);
            System.out.println("run-end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中停止，run()进入catch  "+this.isInterrupted());
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try {
            StopSleep1 sleep1 = new StopSleep1();
            sleep1.start();
            Thread.sleep(200);
            sleep1.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main-catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
