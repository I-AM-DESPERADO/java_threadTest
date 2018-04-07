package com.tz2.synch.synCodeBlock4;

/**
 * create by tz on 2018-04-06
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUserNamePassword("b", "bb");
    }

}
