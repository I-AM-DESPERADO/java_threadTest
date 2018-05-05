package com.tz4.awaitUtilTest;

import java.util.Calendar;
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
     * Method notifyMethod
     *
     */
    public void notifyMethod() {
        try {
            Calendar calendarRef = Calendar.getInstance();

            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("notify begin timer = " + System.currentTimeMillis());
            condition.signalAll();
            System.out.println("notify   end timer = " + System.currentTimeMillis());
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
            Calendar calendarRef = Calendar.getInstance();

            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("wait begin timer = " + System.currentTimeMillis());
            condition.awaitUntil(calendarRef.getTime());
            System.out.println("wait   end timer = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
