package com.tz7.stateTest1;

/**
 * create by tz on 2018-05-06
 */
public class MyThread extends Thread {

    /**
     * Constructs MyThread
     *
     */
    public MyThread() {
        System.out.println("构造方法中的状态 ：" + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中的状态：" + Thread.currentThread().getState());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
