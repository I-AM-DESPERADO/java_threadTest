package com.tz3.p_c_allWait;

/**
 * create by tz on 2018-04-15
 */
public class ThreadC extends Thread {

    /** Field c */
    private C c;

    /**
     * Constructs ThreadC
     *
     *
     * @param c
     */
    public ThreadC(C c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.setValue();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
