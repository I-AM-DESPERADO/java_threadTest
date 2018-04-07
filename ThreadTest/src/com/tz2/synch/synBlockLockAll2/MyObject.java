package com.tz2.synch.synBlockLockAll2;

/**
 * create by tz on 2018-04-07
 */
public class MyObject {
    public  void speedPrintString() {
        synchronized (this) {
            System.out.println("speedPrintString _____getLock time = "
                    + System.currentTimeMillis()
                    + "  run ThreadName = " + Thread.currentThread().getName());
            System.out.println("----------------------");
            System.out.println("speedPrintString _____releaseLock time = "
                    + System.currentTimeMillis()
                    + "run ThreadName = " + Thread.currentThread().getName());
        }

    }
}
