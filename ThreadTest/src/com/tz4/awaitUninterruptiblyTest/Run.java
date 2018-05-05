package com.tz4.awaitUninterruptiblyTest;

/**
 * create by tz on 2018-04-29
 */
public class Run {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            Service  service  = new Service();
            MyThread myThread = new MyThread(service);

            myThread.start();
            Thread.sleep(3000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
