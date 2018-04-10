package com.tz2.synch.towStop;

/**
 * create by tz on 2018-04-07
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA(new Object());
    }
}
