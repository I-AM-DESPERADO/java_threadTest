package com.tz2.synch.synCodeBlock;

/**
 * create by tz on 2018-04-02
 */
public class SynCodeBlockTestThreadA extends Thread {
    private ObjectService service;
    public SynCodeBlockTestThreadA(ObjectService objectService){
        super();
        this.service = objectService;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
