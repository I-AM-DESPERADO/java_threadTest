package com.tz3.p_c_allWait;

/**
 * create by tz on 2018-04-15
 */
public class ThreadP extends Thread {

    /** Field p */
    private P p;

    /**
     * Constructs ThreadP
     *
     *
     * @param p
     */
    public ThreadP(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
