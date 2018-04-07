package com.tz2.synch.synCodeBlock4;

/**
 * create by tz on 2018-04-06
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUserNamePassword("a", "aa");
    }
}
