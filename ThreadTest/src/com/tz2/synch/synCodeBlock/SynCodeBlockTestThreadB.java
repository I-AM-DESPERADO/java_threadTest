package com.tz2.synch.synCodeBlock;

/**
 * create by tz on 2018-04-02
 */
public class SynCodeBlockTestThreadB extends Thread {
    private ObjectService service;
    public SynCodeBlockTestThreadB(ObjectService objectService){
        super();
        this.service = objectService;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }

}
