package com.tz2.synch.synStaticMethod;

/**
 * create by tz on 2018-04-07
 */
public class Service {
    public static synchronized void printA() {
        try {
            System.out.println("ThreadName = " + Thread.currentThread().getName()
                    + " into printA at time = " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("ThreadName = " + Thread.currentThread().getName()
                    + " out printA at time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void printB() {
        System.out.println("ThreadName = " + Thread.currentThread().getName()
                + " into printB at time = " + System.currentTimeMillis());
        System.out.println("ThreadName = " + Thread.currentThread().getName()
                + " out printB at time = " + System.currentTimeMillis());
    }
}
