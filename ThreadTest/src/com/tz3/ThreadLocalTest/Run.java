package com.tz3.ThreadLocalTest;

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
            ThreadB b = new ThreadB();

            a.start();
            b.start();

            for (int i = 0; i < 100; i++) {
                Tools.t1.set("Main get Value = " + (i + 1));
                System.out.println("Main get Value = " + Tools.t1.get());
            }

            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
