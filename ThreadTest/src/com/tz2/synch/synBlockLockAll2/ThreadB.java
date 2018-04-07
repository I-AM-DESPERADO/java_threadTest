package com.tz2.synch.synBlockLockAll2;

/**
 * create by tz on 2018-04-07
 */
public class ThreadB extends Thread {
    private MyObject object;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
