package com.tz4.lockMethodTest1.test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * create by tz on 2018-04-24
 */
public class Service {

    /** Field lock */
    private ReentrantLock lock = new ReentrantLock();

    public ReentrantLock getLock() {
        return lock;
    }

    public void setLock(ReentrantLock lock) {
        this.lock = lock;
    }

    /**
     * Method serviceMethod1
     *
     */
    public void serviceMethod1() {
        try {
            lock.lock();
            System.out.println("ThreadName = " + Thread.currentThread().getName() + "进入方法");
            Thread.sleep(Integer.MAX_VALUE);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
