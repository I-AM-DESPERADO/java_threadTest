package com.tz4.ConditionTestManyToMany;



/**
 * create by tz on 2018-04-23
 */
public class MyThreadB extends Thread {

    /** Field service */
    private MyService service;

    /**
     * Constructs MyThreadB
     *
     *
     * @param service
     */
    public MyThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.get();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
