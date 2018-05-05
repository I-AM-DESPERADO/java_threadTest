package com.tz4.MustUseMoreCondition_OK;

/**
 * create by tz on 2018-04-22
 */
public class ThreadA extends Thread {

    /** Field service */
    private MyService service;

    /**
     * Constructs ThreadA
     *
     *
     * @param service
     */
    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    /**
     * Method run
     *
     */
    public void run() {
        service.awaitA();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
