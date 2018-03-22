package com.tz.suspendTest;

import com.tz.suspendTest.model.MyObject;

/**
 * create by tz on 2018-03-20
 */
public class SuspendTestThread2 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                myObject.setValue("a","aa");
            }
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                myObject.printUsernamePassword();
            }
        };
        thread2.start();
    }
}
