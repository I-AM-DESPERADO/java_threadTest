package com.tz4.lockMethodTest1.test3;

/**
 * create by tz on 2018-04-25
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
        final Service service  = new Service();
        Runnable      runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }

        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

        Thread.sleep(2000);
        service.notifyMethod();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
