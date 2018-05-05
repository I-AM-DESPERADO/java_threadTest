package com.tz4.tryLock_param;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * create by tz on 2018-04-29
 */
public class MyService {

    /** Field lock */
    private ReentrantLock lock = new ReentrantLock();

    /**
     * Method waitMethod
     *
     */
    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println("     " + Thread.currentThread().getName() + "获得锁的时间： "
                                   + System.currentTimeMillis());
                Thread.sleep(100);
            } else {
                System.out.println("     " + Thread.currentThread().getName() + "未获得锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
