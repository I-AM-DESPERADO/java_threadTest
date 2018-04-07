package com.tz2.synch.synTowLock;

/**
 * create by tz on 2018-04-07
 */
public class Service {
    public static synchronized void printA() {
        try {
            System.out.println("ThreadName = " + Thread.currentThread().getName()
                    + " into printA at time = " + System.currentTimeMillis());
            Thread.sleep(6000);
            System.out.println("ThreadName = " + Thread.currentThread().getName()
                    + " into printA at time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void printB() {
        System.out.println("ThreadName = " + Thread.currentThread().getName()
                + " into printB at time = " + System.currentTimeMillis());
        System.out.println("ThreadName = " + Thread.currentThread().getName()
                + " into printB at time = " + System.currentTimeMillis());
    }


    public static synchronized void printC() {
        System.out.println("ThreadName = " + Thread.currentThread().getName()
                + " into printC at time = " + System.currentTimeMillis());
        System.out.println("ThreadName = " + Thread.currentThread().getName()
                + " into printC at time = " + System.currentTimeMillis());
    }
}
