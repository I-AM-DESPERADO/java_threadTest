package com.tz3.p_r_test;

/**
 * create by tz on 2018-04-15
 * 生产者线程
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
