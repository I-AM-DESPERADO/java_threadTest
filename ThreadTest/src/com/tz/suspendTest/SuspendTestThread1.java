package com.tz.suspendTest;

import com.tz.suspendTest.model.SynchronizedObject;

/**
 * create by tz on 2018-03-20
 */
public class SuspendTestThread1 extends Thread {
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread(){
                @Override
                public void run() {
                    System.out.println("thraed2启动，但进入不了printString()方法");
                    System.out.println("因为printString()方法被a线程锁定并独占了");
                    object.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
