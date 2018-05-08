package com.tz6.singleton_0;

/**
 * create by tz on 2018-05-05
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
