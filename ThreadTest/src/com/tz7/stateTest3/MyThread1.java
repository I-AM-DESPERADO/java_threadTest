package com.tz7.stateTest3;

/**
 * create by tz on 2018-05-07
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
