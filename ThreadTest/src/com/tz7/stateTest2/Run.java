package com.tz7.stateTest2;

/**
 * create by tz on 2018-05-07
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
            MyThread t = new MyThread();

            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中状态：" + t.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
