package com.tz4.UseConditionWaitNotifyOK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * create by tz on 2018-04-22
 */
public class MyService {

    /** Field lock */
    private Lock lock = new ReentrantLock();

    /** Field condition */
    public Condition condition = lock.newCondition();

    /**
     * Method await
     *
     */
    public void await() {
        try {
            lock.lock();
            System.out.println(" await时间为 = " + System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void signal() {
        try {
            lock.lock();
            System.out.println("signal 的时间为 = " + System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
