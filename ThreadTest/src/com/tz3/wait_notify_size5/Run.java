package com.tz3.wait_notify_size5;

/**
 * create by tz on 2018-04-12
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA t1 = new ThreadA(lock);
            Thread thread1 = new Thread(t1);
            thread1.start();
            Thread.sleep(50);
            ThreadB t2 = new ThreadB(lock);
            Thread thread2 = new Thread(t2);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
