package com.tz2.synch.test1;

/**
 * create by tz on 2018-03-21
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum numRef;
    public ThreadA(HasSelfPrivateNum numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
