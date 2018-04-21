package com.tz2.runable.t10;

/**
 * create by tz on 2018-04-10
 */
public class PrintString implements Runnable {

    /** Field isContinuePrint */
    private boolean isContinuePrint = true;

    /**
     * Method printStringMethod
     *
     */
    public void printStringMethod() {
        try {
            while (isContinuePrint) {
                System.out.println("run printStringMethod threadName = " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }

    /**
     * Method isContinuePrint
     *
     *
     * @return
     */
    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    /**
     * Method setContinuePrint
     *
     *
     * @param continuePrint
     */
    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
