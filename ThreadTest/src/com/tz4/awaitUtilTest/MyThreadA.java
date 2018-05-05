package com.tz4.awaitUtilTest;

/**
 * create by tz on 2018-04-29
 */
public class MyThreadA extends Thread {

    /** Field service */
    private Service service;

    /**
     * Constructs MyThreadA
     *
     *
     * @param service
     */
    public MyThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
