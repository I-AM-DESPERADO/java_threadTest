package com.tz4.ReentrantLockTest;

/**
 * create by tz on 2018-04-21
 */
public class MyThread extends Thread {

    /** Field service */
    private MyService service;

    /**
     * Constructs MyThread
     *
     *
     * @param service
     */
    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
