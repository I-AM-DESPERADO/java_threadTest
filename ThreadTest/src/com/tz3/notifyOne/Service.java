package com.tz3.notifyOne;

/**
 * create by tz on 2018-04-12
 */
public class Service {
    public void testMethod(Object lock) {
        synchronized (lock) {
            try {
                System.out.println("begin wait() ThreadName = " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("  end wait() ThreadName = " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
