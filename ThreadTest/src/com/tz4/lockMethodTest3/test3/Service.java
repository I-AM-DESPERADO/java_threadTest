package com.tz4.lockMethodTest3.test3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * create by tz on 2018-04-27
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
    public Service(Boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    /**
     * Method serviceMethod
     *
     */
    public void serviceMethod() {
        try {
            System.out.println(lock.isLocked());
            lock.lock();
            System.out.println(lock.isLocked());
        } finally {
            lock.unlock();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
