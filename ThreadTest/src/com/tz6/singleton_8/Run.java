package com.tz6.singleton_8;

/**
 * create by tz on 2018-05-06
 */
public class Run {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
