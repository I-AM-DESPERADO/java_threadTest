package com.tz4.lockInterruptiblyTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * create by tz on 2018-04-29
 */
public class MyService {

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

            // lock.lock();
            lock.lockInterruptibly();
            System.out.println("lock begin " + Thread.currentThread().getName());

            for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
                String newString = new String();

                Math.random();
            }

            System.out.println("lock   end " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("抛异常方法是：" + Thread.currentThread().getName());
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
