package com.tz3.p_c_allWait;

/**
 * create by tz on 2018-04-15
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
        this.lock = lock;
    }

    /**
     * Method setValue
     *
     */
    public void setValue() {
        try {
            synchronized (lock) {
                while (ValueObject.value.equals("")) {
                    System.out.println("消费者" + Thread.currentThread().getName() + " WAITING了☆");
                    lock.wait();
                }

                System.out.println("消费者" + Thread.currentThread().getName() + " RUNNING了");
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
