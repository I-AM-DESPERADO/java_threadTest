package com.tz2.runable.atomicIntegerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * create by tz on 2018-04-10
 */
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();
    public synchronized void addNum() {
        System.out.println(Thread.currentThread().getName() + "加了100之后的值是： " + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
