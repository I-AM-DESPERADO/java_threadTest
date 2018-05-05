package com.tz4.UseConditionWaitNotifyError;

/**
 * create by tz on 2018-04-21
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

    @Override
    public void run() {
        service.await();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
