package com.tz4.MustUseMoreCondition_OK;

/**
 * create by tz on 2018-04-22
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
        service.awaitB();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
