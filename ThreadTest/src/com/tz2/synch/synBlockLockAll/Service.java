package com.tz2.synch.synBlockLockAll;

/**
 * create by tz on 2018-04-07
 */
public class Service {
    public void testmethod1(MyObject object) {
        synchronized (object){
            try {
                System.out.println("testMethod _____getLock time = " + System.currentTimeMillis()
                        + " run ThreadName = "
                        + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod releaseLock time = "
                        + System.currentTimeMillis() + "run ThreadName = "
                        + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
        }

        }
    }
}
