package com.tz3.wait_notify_size5;

/**
 * create by tz on 2018-04-12
 */
public class ThreadA implements Runnable{
    private Object lock;
    public ThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                if (MyList.size() != 5) {
                    System.out.println("wait begin " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end " + System.currentTimeMillis());
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
