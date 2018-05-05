package com.tz4.awaitUninterruptiblyTest;

/**
 * create by tz on 2018-04-29
 */
public class MyThread extends Thread {

    /** Field service */
    private Service service;

    /**
     * Constructs MyThread
     *
     *
     * @param service
     */
    public MyThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
