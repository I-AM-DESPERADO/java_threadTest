package com.tz4.lockMethodTest2.test2;

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
     * Method notifyMethod
     *
     */
    public void notifyMethod() {
        try {
            lock.lock();
            System.out.println(" 有没有线程正在等待condition？ " + lock.hasWaiters(condition) + " 线程数是多少？ "
                               + lock.getWaitQueueLength(condition));
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    /**
     * Method waitMethod
     *
     */
    public void waitMethod() {
        try {
            lock.lock();
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
