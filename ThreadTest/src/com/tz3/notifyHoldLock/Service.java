package com.tz3.notifyHoldLock;

/**
 * create by tz on 2018-04-12
 */
public class Service {

    /**
     * Method synNotifyMethod
     *
     *
     * @param lock
     */
    public void synNotifyMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin notify() ThreadName = " + Thread.currentThread().getName() + " time = "
                                   + System.currentTimeMillis());
                lock.notify();
                Thread.sleep(5000);
                System.out.println("   end notify() ThreadName = " + Thread.currentThread().getName() + " time = "
                                   + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method testMethod
     *
     *
     * @param lock
     */
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() ThreadName = " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("   end wait() ThreadName = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
