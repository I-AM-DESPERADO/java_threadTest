package com.tz4.MustUseMoreCondition_Error;

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
     * Method awaitA
     *
     */
    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA时间为：" + System.currentTimeMillis() + "ThreadName = "
                               + Thread.currentThread().getName());
            condition.await();
            System.out.println("  end awaitA时间为：" + System.currentTimeMillis() + "ThreadName = "
                               + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * Method awaitB
     *
     */
    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB时间为：" + System.currentTimeMillis() + "  ThreadName = "
                               + Thread.currentThread().getName());
            condition.await();
            System.out.println("  end awaitB时间为：" + System.currentTimeMillis() + "  hreadName = "
                               + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * Method signalAll
     *
     */
    public void signalAll() {
        try {
            lock.lock();
            System.out.println("  begin siginAll时间为：" + System.currentTimeMillis() + " ThreadName = "
                               + Thread.currentThread().getName());
            condition.signalAll();
            System.out.println("     end siginalAll时间为：" + System.currentTimeMillis() + " ThreadName = "
                               + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
