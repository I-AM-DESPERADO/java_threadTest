package com.tz3.p_r_test;

/**
 * create by tz on 2018-04-15
 * 消费者类
 */
public class C {

    /** Field lock */
    private String lock;

    /**
     * Constructs C
     *
     *
     * @param lock
     */
    public C(String lock) {
        super();
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                lock.wait();
            }
            System.out.println("get的值是" + ValueObject.value);
            ValueObject.value = "";
            lock.notify();
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
