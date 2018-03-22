package com.tz2.synch.lockTest;



/**
 * create by tz on 2018-03-22
 */
public class ThreadA extends Thread {
    private com.tz2.synch.lockTest.HasSelfPrivateNum numRef;
    public ThreadA(com.tz2.synch.lockTest.HasSelfPrivateNum numRf){
        super();
        this.numRef = numRf;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
