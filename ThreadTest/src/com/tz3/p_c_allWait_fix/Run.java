package com.tz3.p_c_allWait_fix;

/**
 * create by tz on 2018-04-15
 */
public class Run {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        String    lock    = new String("");
        P         p       = new P(lock);
        C         c       = new C(lock);
        ThreadP[] pThread = new ThreadP[3];
        ThreadC[] cThread = new ThreadC[3];

        for (int i = 0; i < 2; i++) {
            pThread[i] = new ThreadP(p);
            pThread[i].setName("生产者  " + i);
            cThread[i] = new ThreadC(c);
            cThread[i].setName("消费者  " + i);
            pThread[i].start();
            cThread[i].start();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
