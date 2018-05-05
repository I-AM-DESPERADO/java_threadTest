package com.tz4.UseConditionWaitNotifyOK;

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

    @Override
    public void run() {
        service.await();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
