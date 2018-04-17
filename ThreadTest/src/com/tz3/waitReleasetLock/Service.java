package com.tz3.waitReleasetLock;

/**
 * create by tz on 2018-04-12
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait()");
                //lock.wait();
                Thread.sleep(1000);
                System.out.println("   end wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
