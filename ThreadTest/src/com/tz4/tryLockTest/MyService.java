package com.tz4.tryLockTest;

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
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + " 加锁");
        } else {
            System.out.println(Thread.currentThread().getName() + " 未加锁");
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
