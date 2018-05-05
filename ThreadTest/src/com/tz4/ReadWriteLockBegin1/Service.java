package com.tz4.ReadWriteLockBegin1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * create by tz on 2018-05-02
 */
public class Service {

    /** Field lock */
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    /**
     * Method read
     *
     */
    public void read() {
        try {
            try {
                lock.readLock().lock();
                System.out.println("获得读锁！" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
