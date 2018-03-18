package com.tz.functionTest;

/**
 * create by tz on 2018-03-18
 */
public class SleepTest extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName = "+this.getName()+"-begin");
            Thread.sleep(2000);
            System.out.println("run ThreadName = "+this.getName()+"-end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SleepTest test = new SleepTest();
        System.out.println("begin = "+ System.currentTimeMillis());
        //test.run();
        test.start();
        System.out.println("end = "+System.currentTimeMillis());
    }
}
