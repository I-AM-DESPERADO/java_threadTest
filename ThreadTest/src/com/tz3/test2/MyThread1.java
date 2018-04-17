package com.tz3.test2;

/**
 * create by tz on 2018-04-12
 */
public class MyThread1 implements Runnable {
    private  Object lock;
    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始          wait time = " + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束          wait time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
