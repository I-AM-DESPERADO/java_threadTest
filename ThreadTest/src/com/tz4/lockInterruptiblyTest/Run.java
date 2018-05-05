package com.tz4.lockInterruptiblyTest;

/**
 * create by tz on 2018-04-29
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
        final MyService service     = new MyService();
        Runnable        runnableRef = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnableRef);

        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);

        Thread threadB = new Thread(runnableRef);

        threadB.setName("B");
        threadB.start();
        threadB.interrupt();    // 打标记
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
