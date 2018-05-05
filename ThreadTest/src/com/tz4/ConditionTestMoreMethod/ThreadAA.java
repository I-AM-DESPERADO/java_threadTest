package com.tz4.ConditionTestMoreMethod;

/**
 * create by tz on 2018-04-21
 */
public class ThreadAA extends Thread {

    /** Field service */
    private MyService service;

    /**
     * Constructs ThreadAA
     *
     *
     * @param service
     */
    public ThreadAA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
