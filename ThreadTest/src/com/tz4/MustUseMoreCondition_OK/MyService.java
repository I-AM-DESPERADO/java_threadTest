package com.tz4.MustUseMoreCondition_OK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.tz2.runable.t10.PrintString;

/**
 * create by tz on 2018-04-22
 */
public class MyService {

    /** Field lock */
    private Lock lock = new ReentrantLock();

    /** Field conditionA */
    public Condition conditionA = lock.newCondition();

    /** Field conditionB */
    public Condition conditionB = lock.newCondition();

    /**
     * Method awaitA
     *
     */
    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA 时间为; " + System.currentTimeMillis() + "  ThreadName = "
                               + Thread.currentThread().getName());
            conditionA.await();
            System.out.println("    end awaitA 时间为; " + System.currentTimeMillis() + "  ThreadName = "
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
            System.out.println("begin awaitB 时间为; " + System.currentTimeMillis() + "  ThreadName = "
                               + Thread.currentThread().getName());
            conditionB.await();
            System.out.println("    end awaitB 时间为; " + System.currentTimeMillis() + "  ThreadName = "
                               + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * Method signalAll_A
     *
     */
    public void signalAll_A() {
        try {
            lock.lock();
            System.out.println("  begin siginAll时间为：" + System.currentTimeMillis() + " ThreadName = "
                               + Thread.currentThread().getName());
            conditionA.signalAll();
            System.out.println("     end siginalAll时间为：" + System.currentTimeMillis() + " ThreadName = "
                               + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }

    /**
     * Method signalAll_B
     *
     */
    public void signalAll_B() {
        try {
            lock.lock();
            System.out.println("  begin siginAll时间为：" + System.currentTimeMillis() + " ThreadName = "
                               + Thread.currentThread().getName());
            conditionB.signalAll();
            System.out.println("     end siginalAll时间为：" + System.currentTimeMillis() + " ThreadName = "
                               + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
