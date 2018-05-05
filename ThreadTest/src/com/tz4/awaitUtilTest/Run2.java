package com.tz4.awaitUtilTest;

/**
 * create by tz on 2018-04-29
 */
public class Run2 {

    /**
     * Method main
     *
     *
     * @param args
     *
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Service   service = new Service();
        MyThreadA a       = new MyThreadA(service);

        a.start();
        Thread.sleep(2000);

        MyThreadB b = new MyThreadB(service);

        b.start();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
