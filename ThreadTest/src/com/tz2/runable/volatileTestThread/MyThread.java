package com.tz2.runable.volatileTestThread;

/**
 * create by tz on 2018-04-10
 */
public class MyThread extends Thread {
    public static volatile int count;
    private static synchronized void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count = " + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
