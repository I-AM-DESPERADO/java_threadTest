package com.tz2.synch.SysBlock;

/**
 * create by tz on 2018-04-04
 */
public class ObjectService {
    public void serviceMethodA(){
        try { synchronized (this){
            System.out.println("A begin time = "+ System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("A end time = "+ System.currentTimeMillis());
        }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void serviceMethodB(){
        synchronized (this){
            System.out.println("B begin time = "+ System.currentTimeMillis());
            System.out.println("B end  time = "+ System.currentTimeMillis());
        }
    }
}
