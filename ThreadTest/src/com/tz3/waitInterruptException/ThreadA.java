package com.tz3.waitInterruptException;

/**
 * create by tz on 2018-04-12
 */
public class ThreadA extends Thread {
    private Object lock;
    public ThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
