package com.tz3.p_r_test;

/**
 * create by tz on 2018-04-15
 */
public class Run {

    /**
     * Method main
     *
     * @param args
     */
    public static void main(String[] args) {
        String  lock    = new String("");
        P       p       = new P(lock);
        C       r       = new C(lock);
        ThreadP pThread = new ThreadP(p);
        ThreadC cThread = new ThreadC(r);
        pThread.start();
        cThread.start();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
