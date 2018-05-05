package com.tz4.ConditionTestMoreMethod;

/**
 * create by tz on 2018-04-21
 */
public class Run {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA   a       = new ThreadA(service);

        a.setName("A");
        a.start();

        ThreadAA aa = new ThreadAA(service);

        aa.setName("AA");
        aa.start();

        ThreadB b = new ThreadB(service);

        b.setName("B");
        b.start();

        ThreadBB bb = new ThreadBB(service);

        bb.setName("BB");
        bb.start();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
