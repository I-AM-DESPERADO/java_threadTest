package com.tz2.synch.synStaticMethod;

/**
 * create by tz on 2018-04-07
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        Service.printA();
    }
}
