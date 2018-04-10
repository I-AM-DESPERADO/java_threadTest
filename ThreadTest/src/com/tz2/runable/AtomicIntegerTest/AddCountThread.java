package com.tz2.runable.AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * create by tz on 2018-04-10
 */
public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
