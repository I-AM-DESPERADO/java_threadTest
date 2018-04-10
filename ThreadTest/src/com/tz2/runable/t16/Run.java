package com.tz2.runable.t16;

/**
 * create by tz on 2018-04-10
 */
public class Run {
    public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunnable(false);
            System.out.println("已经赋值为false!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
