package com.tz3.joinException;

/**
 * create by tz on 2018-04-17
 */
public class ThreadC extends Thread {

    /** Field threadB */
    private ThreadB threadB;

    /**
     * Constructs ThreadC
     *
     *
     * @param threadB
     */
    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
