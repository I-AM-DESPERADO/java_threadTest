package com.tz4.awaitUninterruptiblyTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * create by tz on 2018-04-29
 */
public class Service {

    /** Field lock */
    private ReentrantLock lock = new ReentrantLock();

    /** Field condition */
    private Condition condition = lock.newCondition();

    /**
     * Method testMethod
     *
     */
    public void testMethod() {
        try {
            lock.lock();
            System.out.println("wait Begin");
            condition.awaitUninterruptibly();
            System.out.println("wait   end");
        } finally {
            lock.unlock();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
