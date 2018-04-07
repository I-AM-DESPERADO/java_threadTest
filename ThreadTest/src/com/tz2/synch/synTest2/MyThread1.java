package com.tz2.synch.synTest2;


/**
 * create by tz on 2018-04-07
 */
public class MyThread1 extends Thread {
    private MyOneList list;
    public MyThread1(MyOneList list){
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService msRer = new MyService();
        msRer.addServiceMethod(list, "A");
    }
}
