package com.tz2.synch.synBlockLockAll2;

/**
 * create by tz on 2018-04-07
 */
public class Service {
    public void testMethod(MyObject object) {
        synchronized (object) {
            try {
                System.out.println("TestMethod ____getLock time"
                        + System.currentTimeMillis()
                        + "run ThreadName = "
                        + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("TestMethod _____getLock time = "
                        + System.currentTimeMillis()
                        + "run ThreadName = "
                        + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
