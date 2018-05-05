package com.tz4.ReentrantLockTest;

/**
 * create by tz on 2018-04-21
 */
public class Run {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread  a1      = new MyThread(service);
        MyThread  a2      = new MyThread(service);
        MyThread  a3      = new MyThread(service);
        MyThread  a4      = new MyThread(service);
        MyThread  a5      = new MyThread(service);
        MyThread  a6      = new MyThread(service);

        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
        a6.start();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
