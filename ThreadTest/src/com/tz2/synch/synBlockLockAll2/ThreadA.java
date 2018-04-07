package com.tz2.synch.synBlockLockAll2;


/**
 * create by tz on 2018-04-07
 */
public class ThreadA extends Thread {
    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject object) {
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod(object);
    }
}
