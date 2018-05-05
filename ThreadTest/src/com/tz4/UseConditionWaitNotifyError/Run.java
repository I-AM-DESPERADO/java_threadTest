package com.tz4.UseConditionWaitNotifyError;

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

        a.start();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
