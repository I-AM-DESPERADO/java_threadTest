package com.tz3.joinMoreTest;

/**
 * create by tz on 2018-04-17
 */
public class ThreadA extends Thread {

    /** Field b */
    private ThreadB b;

    /**
     * Constructs ThreadA
     *
     *
     * @param b
     */
    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                System.out.println("begin A ThreadName = " + Thread.currentThread().getName() + "   "
                                   + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("    end A ThreadName = " + Thread.currentThread().getName() + "    "
                                   + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
