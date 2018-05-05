package com.tz4.ConditionTestManyToMany;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * create by tz on 2018-04-23
 */
public class MyService {

    /** Field lock */
    private ReentrantLock lock = new ReentrantLock();

    /** Field condition */
    private Condition condition = lock.newCondition();

    /** Field hasValue */
    private boolean hasValue = false;

    /**
     * Method get
     *
     */
    public void get() {
        try {
            lock.lock();

            while (!hasValue) {
                System.out.println("可能☆☆连续");
                condition.await();
            }

            System.out.println("打印☆");
            hasValue = false;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * Method set
     *
     */
    public void set() {
        try {
            lock.lock();

            while (hasValue) {
                System.out.println("可能★★连续");
                condition.await();
            }

            System.out.println("打印★");
            hasValue = true;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
