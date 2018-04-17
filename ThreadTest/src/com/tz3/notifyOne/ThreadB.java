package com.tz3.notifyOne;

/**
 * create by tz on 2018-04-12
 */
public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
