package com.tz2.synch.deadLockTest;

/**
 * create by tz on 2018-04-07
 */
public class Run {
    public static void main(String[] args) {

        try {
            DeadThread t1 = new DeadThread();
            t1.setFlag("a");
            Thread thread1 = new Thread(t1);
            thread1.start();
            Thread.sleep(100);
            t1.setFlag("b");
            Thread thread2 = new Thread(t1);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
