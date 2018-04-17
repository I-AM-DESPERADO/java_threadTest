package com.tz3.test2;


/**
 * create by tz on 2018-04-12
 */
public class MyThread2 implements Runnable {
    private Object lock;

    public MyThread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            synchronized (lock) {
                System.out.println("开始 notify time = " + System.currentTimeMillis());
                lock.notify();
                System.out.println("结束 notify time = " + System.currentTimeMillis());
            }
        }

    }
}
