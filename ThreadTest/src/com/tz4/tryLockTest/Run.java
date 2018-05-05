package com.tz4.tryLockTest;

/**
 * create by tz on 2018-04-29
 */
public class Run {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        final MyService service     = new MyService();
        Runnable        runnableRef = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnableRef);

        threadA.setName("A ");
        threadA.start();

        Thread threadB = new Thread(runnableRef);

        threadB.setName("B ");
        threadB.start();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
