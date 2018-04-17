package com.tz3.stack_1;

/**
 * create by tz on 2018-04-15
 */
public class P_Thread extends Thread {
    private P p;
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
