package com.tz3.p_c_allWait;

/**
 * create by tz on 2018-04-15
 */
public class P {

    /** Field lock */
    private String lock;

    /**
     * Constructs P
     *
     *
     * @param lock
     */
    public P(String lock) {
        this.lock = lock;
    }

    /**
     * Method setValue
     *
     */
    public void setValue() {
        try {
            synchronized (lock) {
                while (!ValueObject.value.equals("")) {
                    System.out.println("生产者" + Thread.currentThread().getName() + " WAITING了★");
                    lock.wait();
                }

                System.out.println("生产者" + Thread.currentThread().getName() + " RUNNING了");
                ValueObject.value = System.currentTimeMillis() + "_" + System.nanoTime();
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
