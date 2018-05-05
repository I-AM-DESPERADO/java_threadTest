package com.tz4.lockMethodTest2.test1;

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
        Thread threadA = new Thread(runnable);

        threadA.start();
        Thread.sleep(500);

        Thread threadB = new Thread(runnable);

        threadB.start();
        Thread.sleep(500);
        System.out.println(service.getLock().hasQueuedThread(threadA));
        System.out.println(service.getLock().hasQueuedThread(threadB));
        System.out.println(service.getLock().hasQueuedThreads());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
