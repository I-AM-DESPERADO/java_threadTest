package com.tz7.stateTest2;

/**
 * create by tz on 2018-05-07
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("begin sleep");

        try {
            Thread.sleep(10000);
            System.out.println("  end sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
