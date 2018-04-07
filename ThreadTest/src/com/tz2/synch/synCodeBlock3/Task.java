package com.tz2.synch.synCodeBlock3;

/**
 * create by tz on 2018-04-02
 */
public class Task {
    public void doLongTimeTask(){
        for (int i = 0; i < 10000; i++){
            System.out.println("noSynchronized threadName = "+ Thread.currentThread().getName()+ " i = "+ (i + 1));
        }

        synchronized (this){
            for (int j = 0;j < 10000; j++){
                System.out.println("synchronized threadName = "+ Thread.currentThread().getName() + " j = "+ (j + 1));
            }
        }
    }

}
