package com.tz4.MustUseMoreCondition_OK;

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

        ThreadB b = new ThreadB(service);

        b.setName("B");
        b.start();
        Thread.sleep(3000);
        service.signalAll_A();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
