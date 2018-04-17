package com.tz3.stack_4;

/**
 * create by tz on 2018-04-15
 */
public class P_Thread extends Thread {

    /** Field p */
    private P p;

    /**
     * Constructs P_Thread
     *
     *
     * @param p
     */
    public P_Thread(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.pushService();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
