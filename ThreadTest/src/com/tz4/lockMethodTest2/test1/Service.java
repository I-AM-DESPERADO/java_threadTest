package com.tz4.lockMethodTest2.test1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * create by tz on 2018-04-25
 */
public class Service {

    /** Field lock */
    private ReentrantLock lock = new ReentrantLock();

    /** Field condition */
    private Condition condition = lock.newCondition();

    /**
     * Method waitMethod
     *
     */
    public void waitMethod() {
        try {
            lock.lock();
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * Method getCondition
     *
     *
     * @return
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * Method setCondition
     *
     *
     * @param condition
     */
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    /**
     * Method getLock
     *
     *
     * @return
     */
    public ReentrantLock getLock() {
        return lock;
    }

    /**
     * Method setLock
     *
     *
     * @param lock
     */
    public void setLock(ReentrantLock lock) {
        this.lock = lock;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
