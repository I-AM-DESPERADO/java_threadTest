package com.tz2.runable.atomicIntegerNoSafe;

/**
 * create by tz on 2018-04-10
 */
public class MyThread extends Thread {
    private MyService myService;
    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
