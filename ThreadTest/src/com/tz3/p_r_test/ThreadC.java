package com.tz3.p_r_test;

/**
 * create by tz on 2018-04-15
 */
public class ThreadC extends Thread {

    /** Field r */
    private C r;

    /**
     * Constructs ThreadC
     *
     *
     * @param r
     */
    public ThreadC(C r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.getValue();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
