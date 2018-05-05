package com.tz4.lockMethodTest1.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * create by tz on 2018-04-24
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
            System.out.println("有 " + lock.getWaitQueueLength(condition) + "个线程正在等待");
            condition.signalAll();
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
