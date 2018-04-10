package com.tz2.synch.setNewStringTowLock;

/**
 * create by tz on 2018-04-10
 */
public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
