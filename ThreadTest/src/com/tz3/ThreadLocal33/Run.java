package com.tz3.ThreadLocal33;

/**
 * Class Run
 *
 *
 * @version        1.0, 18/04/21
 * @author         tz
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
            for (int i = 0; i < 10; i++) {
                System.out.println("    在Main线程中取值 = " + Tools.t1.get());
                Thread.sleep(100);
            }

            Thread.sleep(5000);

            ThreadA a = new ThreadA();

            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
