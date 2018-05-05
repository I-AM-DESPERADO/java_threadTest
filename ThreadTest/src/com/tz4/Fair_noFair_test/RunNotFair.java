package com.tz4.Fair_noFair_test;

/**
 * create by tz on 2018-04-23
 */
public class RunNotFair {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        final Service service  = new Service(false);
        Runnable      runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("★线程 " + Thread.currentThread().getName() + " 运行了");
                service.serviceMethod();
            }
        };
        Thread[] threadArray = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }

        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
