package com.tz2.synch.stringAndSyn;

/**
 * create by tz on 2018-04-07
 */
public class Service {
    public static void  print(Object object) {
        try {
            synchronized (object) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
