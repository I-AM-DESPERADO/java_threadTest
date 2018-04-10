package com.tz2.runable.synUpdateNewValue;

/**
 * create by tz on 2018-04-10
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}
