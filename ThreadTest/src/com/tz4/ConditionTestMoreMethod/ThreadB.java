package com.tz4.ConditionTestMoreMethod;

/**
 * create by tz on 2018-04-21
 */
public class ThreadB extends Thread {

    /** Field service */
    private MyService service;

    /**
     * Constructs ThreadB
     *
     *
     * @param service
     */
    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
