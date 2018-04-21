package com.tz3.s5;

/**
 * create by tz on 2018-04-19
 */
public class Run {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();

            a.start();
            Thread.sleep(1000);

            ThreadB b = new ThreadB();

            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
