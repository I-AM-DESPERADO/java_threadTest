package com.tz3.notifyOne;

/**
 * create by tz on 2018-04-12
 */
public class ThreadC extends Thread {
    private Object lock;

    public ThreadC(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
