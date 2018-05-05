package com.tz4.ConditionTest;

/**
 * create by tz on 2018-04-23
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
        MyThreadA a       = new MyThreadA(service);

        a.start();

        MyThreadB b = new MyThreadB(service);

        b.start();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
