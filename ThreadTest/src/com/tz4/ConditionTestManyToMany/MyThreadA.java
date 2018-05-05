package com.tz4.ConditionTestManyToMany;


/**
 * create by tz on 2018-04-23
 */
public class MyThreadA extends Thread {

    /** Field service */
    private MyService service;

    /**
     * Constructs MyThreadA
     *
     *
     * @param service
     */
    public MyThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.set();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
