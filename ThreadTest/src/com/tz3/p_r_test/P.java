package com.tz3.p_r_test;

/**
 * create by tz on 2018-04-15
 * 生产者类
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
        super();
        this.lock = lock;
    }

    /**
     * Method setLock
     *
     */
    public void setValue() {
        try {
            synchronized (lock) {
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }

                String value = System.currentTimeMillis() + "_" + System.nanoTime();

                System.out.println("set的值是：" + value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
