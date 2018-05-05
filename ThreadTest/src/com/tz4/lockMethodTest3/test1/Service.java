package com.tz4.lockMethodTest3.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * create by tz on 2018-04-25
 */
public class Service {

    /** Field lock */
    private ReentrantLock lock = new ReentrantLock();

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
            lock.lock();
            System.out.println("公平锁情况：" + lock.isFair());
        } finally {
            lock.unlock();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
