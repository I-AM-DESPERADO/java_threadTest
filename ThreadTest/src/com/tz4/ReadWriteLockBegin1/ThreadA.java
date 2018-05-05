package com.tz4.ReadWriteLockBegin1;

/**
 * create by tz on 2018-05-02
 */
public class ThreadA extends Thread {

    /** Field service */
    private Service service;

    /**
     * Constructs ThreadA
     *
     *
     * @param service
     */
    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
