package com.tz7.stateTest3;

/**
 * create by tz on 2018-05-07
 */
public class Run {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();

        t1.setName("A");
        t1.start();

        MyThread2 t2 = new MyThread2();

        t2.setName("B");
        t2.start();
        System.out.println("main方法中的t2状态：" + t2.getState());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
