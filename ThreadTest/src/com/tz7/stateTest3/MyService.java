package com.tz7.stateTest3;

/**
 * create by tz on 2018-05-07
 */
public class MyService {

    /**
     * Method serviceMethod
     *
     */
    public static synchronized void serviceMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + " 进入了业务方法");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
