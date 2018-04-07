package com.tz2.synch.synCodeBlock;

/**
 * create by tz on 2018-04-02
 */
public class ObjectService {
    public void serviceMethod(){
        try {
            synchronized (this){
                System.out.println("begin time = "+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end!  end time = "+System.currentTimeMillis());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
