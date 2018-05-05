package com.tz4.UseConditionWaitNotifyOK;

/**
 * create by tz on 2018-04-22
 */
public class Run {

    /**
     * Method main
     *
     *
     * @param args
     *
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA   a       = new ThreadA(service);

        a.setName("A");
        a.start();
        Thread.sleep(3000);
        service.signal();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
