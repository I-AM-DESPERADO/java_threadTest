package com.tz3.waitInterruptException;

/**
 * create by tz on 2018-04-12
 */
public class Service {
    public void testMethod(Object lock) {
        synchronized (lock) {
            try {
                System.out.println("begin wait()");
                lock.wait();
                System.out.println("   end wait()");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(" 出现异常，因为wait状态的线程被interrupt了");
            }
        }
    }
}
