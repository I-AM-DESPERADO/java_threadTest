package com.tz2.synch.setNewStringTowLock;

/**
 * create by tz on 2018-04-10
 */
public class ThreadB extends Thread{
    private MyService service;
    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
