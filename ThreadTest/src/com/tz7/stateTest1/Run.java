package com.tz7.stateTest1;

/**
 * create by tz on 2018-05-06
 */
public class Run {

    /**
     * NEW
     * RUNNABLE
     * TERMINATED
     * BLOCKED
     * WAITING
     * TIMED_WAITING
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            MyThread t = new MyThread();

            System.out.println("main方法中的状态1：" + t.getState());
            Thread.sleep(1000);
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态2：" + t.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
