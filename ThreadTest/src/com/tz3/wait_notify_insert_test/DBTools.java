package com.tz3.wait_notify_insert_test;

/**
 * create by tz on 2018-04-17
 */
public class DBTools {

    /** Field prevIsA */
    private volatile boolean prevIsA = false;

    /**
     * Method backupA
     *
     */
    public synchronized void backupA() {
        try {
            while (prevIsA) {
                wait();
            }

            for (int i = 0; i < 5; i++) {
                System.out.println("★★★★★★");
            }

            prevIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method backupB
     *
     */
    public synchronized void backupB() {
        try {
            while (!prevIsA) {
                wait();
            }

            for (int i = 0; i < 5; i++) {
                System.out.println("☆☆☆☆☆☆");
            }

            prevIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
