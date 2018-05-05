package com.tz4.awaitUtilTest;

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
        Service   service = new Service();
        MyThreadA a       = new MyThreadA(service);

        a.start();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
