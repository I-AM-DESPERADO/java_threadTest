package com.tz4.ConditionTestMoreMethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * create by tz on 2018-04-21
 */
public class MyService {

    /** Field lock */
    private Lock lock = new ReentrantLock();

    /**
     * Method methodA
     *
     */
    public void methodA() {
        try {
            lock.lock();
            System.out.println("methodA begin ThreadName = " + Thread.currentThread().getName() + "  time"
                               + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  methodA end ThreadName = " + Thread.currentThread().getName() + "  time"
                               + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * Method methodB
     *
     */
    public void methodB() {
        try {
            lock.lock();
            System.out.println("methodB begin ThreadName = " + Thread.currentThread().getName() + "  time"
                               + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  methodB end ThreadName = " + Thread.currentThread().getName() + "  time"
                               + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
