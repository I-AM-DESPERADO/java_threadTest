package com.tz6.singleton_8;

/**
 * create by tz on 2018-05-06
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.getInstance().hashCode());
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
