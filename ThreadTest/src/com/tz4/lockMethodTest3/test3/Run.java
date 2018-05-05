package com.tz4.lockMethodTest3.test3;

/**
 * create by tz on 2018-04-27
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
    }
}
