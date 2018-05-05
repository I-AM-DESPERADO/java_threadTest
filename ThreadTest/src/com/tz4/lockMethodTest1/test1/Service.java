package com.tz4.lockMethodTest1.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * create by tz on 2018-04-24
 */
public class Service {

    /** Field lock */
    private ReentrantLock lock = new ReentrantLock();

    /**
     * Method serviceMethod1
     *
     */
    public void serviceMethod1() {
        try {
            lock.lock();
            System.out.println("serviceMethod1 getHoldCount = " + lock.getHoldCount());
            serviceMethod2();
        } finally {
            lock.unlock();
        }
    }

    /**
     * Method serviceMethod2
     *
     */
    public void serviceMethod2() {
        try {
            lock.lock();
            System.out.println("serviceMethod2 getHoldCount = " + lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
