package com.tz3.joinTest2;

/**
 * create by tz on 2018-04-17
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
            MyThread thread = new MyThread();

            thread.start();
            thread.join();
            System.out.println("我想当threadTest对象执行完毕之后再执行，我做到了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
