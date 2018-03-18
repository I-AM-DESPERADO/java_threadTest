package com.tz.StopThread;

/**
 * create by tz on 2018-03-18
 */
public class InterruptTest extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i<50000;i++){
            System.out.println("i = "+ (i+1));
        }
    }

    public static void main(String[] args) {
        try {
            InterruptTest test = new InterruptTest();
            test.start();
            Thread.sleep(2000);
            Thread.interrupted();
        } catch (InterruptedException e) {
            System.out.println("main-catch");
            e.printStackTrace();
        }
    }
}
