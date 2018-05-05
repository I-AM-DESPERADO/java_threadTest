package com.tz4.ReadWriteLockBegin2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * create by tz on 2018-05-02
 */
public class Service {

    /** Field lock */
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    /**
     * Method write
     *
     */
    public void write() {
        try {
            try {
                lock.writeLock().lock();
                System.out.println("数据写入" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.writeLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
