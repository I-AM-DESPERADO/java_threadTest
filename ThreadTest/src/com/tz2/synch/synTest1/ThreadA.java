package com.tz2.synch.synTest1;

/**
 * create by tz on 2018-04-06
 */
public class ThreadA extends Thread {
    private MyList list;

    public ThreadA(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++){
            list.add("threadA"+ (i+ 1));
        }
    }

}
