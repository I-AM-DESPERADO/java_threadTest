package com.tz2.synch.lockTest2;

/**
 * create by tz on 2018-03-22
 */
public class LockThreadB extends Thread {
    private LockTestObject object;
    public LockThreadB(LockTestObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
