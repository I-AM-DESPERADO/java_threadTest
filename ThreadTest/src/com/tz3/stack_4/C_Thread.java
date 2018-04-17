package com.tz3.stack_4;

/**
 * create by tz on 2018-04-15
 */
public class C_Thread extends Thread {

    /** Field c */
    private C c;

    /**
     * Constructs C_Thread
     *
     *
     * @param c
     */
    public C_Thread(C c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.popService();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
