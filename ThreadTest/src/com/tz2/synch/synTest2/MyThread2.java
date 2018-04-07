package com.tz2.synch.synTest2;

/**
 * create by tz on 2018-04-07
 */
public class MyThread2 extends Thread {
    private MyOneList list;
    public MyThread2(MyOneList list){
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService msRer = new MyService();
        msRer.addServiceMethod(list, "B");
    }
}
