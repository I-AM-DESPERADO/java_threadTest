package com.tz3.test2;

/**
 * create by tz on 2018-04-12
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 t1 = new MyThread1(lock);
            Thread thread1 = new Thread(t1);
            thread1.start();
            Thread.sleep(3000);
            MyThread2 t2 = new MyThread2(lock);
            Thread thread2 = new Thread(t2);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
