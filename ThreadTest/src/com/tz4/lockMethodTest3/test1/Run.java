package com.tz4.lockMethodTest3.test1;

/**
 * create by tz on 2018-04-25
 */
public class Run {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable      runnable = new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);

        thread.start();

        final Service service2 = new Service(false);

        runnable = new Runnable() {
            @Override
            public void run() {
                service2.serviceMethod();
            }
        };
        thread = new Thread(runnable);
        thread.start();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
