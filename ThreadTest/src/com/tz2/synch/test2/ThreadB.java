package com.tz2.synch.test2;

/**
 * create by tz on 2018-03-22
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;
    public ThreadB(HasSelfPrivateNum numRf){
        super();
        this.numRef = numRf;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }

}
