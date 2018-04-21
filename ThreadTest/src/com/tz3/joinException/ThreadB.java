package com.tz3.joinException;

/**
 * create by tz on 2018-04-17
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();

            a.start();
            a.join();
            System.out.println("线程B在run end之前打印的");
        } catch (InterruptedException e) {
            System.out.println("线程B在catch处打印的");
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
