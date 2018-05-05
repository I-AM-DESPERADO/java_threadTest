package com.tz4.awaitUtilTest;

/**
 * create by tz on 2018-04-29
 */
public class MyThreadB extends Thread {

    /** Field service */
    private Service service = new Service();

    /**
     * Constructs MyThreadB
     *
     */
    public MyThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
