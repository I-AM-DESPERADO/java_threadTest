package com.tz2.synch.synTowLock;

/**
 * create by tz on 2018-04-07
 */
public class ThreadC extends Thread {
    private Service service;

    public ThreadC(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
