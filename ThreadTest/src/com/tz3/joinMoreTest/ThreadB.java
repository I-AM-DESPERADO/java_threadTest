package com.tz3.joinMoreTest;

/**
 * create by tz on 2018-04-17
 */
public class ThreadB extends Thread {
    @Override
    public synchronized void run() {
        try {
            System.out.println("begin B ThreadName = " + Thread.currentThread().getName() + "   "
                               + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("   end B ThreadName = " + Thread.currentThread().getName() + "   "
                               + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
