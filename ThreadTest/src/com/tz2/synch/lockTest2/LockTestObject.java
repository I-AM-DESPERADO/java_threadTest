package com.tz2.synch.lockTest2;


/**
 * create by tz on 2018-03-22
 */
public class LockTestObject {
     public void methodA(){
        try {
            System.out.println("Begin methodA threadName = "+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("methodA end! endTime = "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodB(){
        try {
            System.out.println("Begin methodB threadName = "+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("methodB end! endTime = "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
