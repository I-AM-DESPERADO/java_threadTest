package com.tz4.MustUseMoreCondition_Error;

/**
 * create by tz on 2018-04-22
 */
public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
