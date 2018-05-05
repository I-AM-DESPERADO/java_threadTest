package com.tz4.lockMethodTest1.test2;

/**
 * create by tz on 2018-04-24
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
                service.serviceMethod1();
            }
        };
        Thread[] threadArray = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }

        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }

        Thread.sleep(2000);
        System.out.println("有线程数：" + service.getLock().getQueueLength() + "  在等待线程!");
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
