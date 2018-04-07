package com.tz2.synch.synTest;

/**
 * create by tz on 2018-04-06
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.a();
    }
}
