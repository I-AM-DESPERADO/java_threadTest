package com.tz4.Fair_noFair_test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * create by tz on 2018-04-23
 */
public class Service {

    /** Field lock */
    private ReentrantLock lock;

    /**
     * Constructs Service
     *
     *
     * @param isFair
     */
    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    /**
     * Method serviceMethod
     *
     */
    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("ThreadName = " + Thread.currentThread().getName() + "获得锁定");
        } finally {
            lock.unlock();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
