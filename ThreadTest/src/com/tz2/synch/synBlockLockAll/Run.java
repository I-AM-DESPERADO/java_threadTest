package com.tz2.synch.synBlockLockAll;

/**
 * create by tz on 2018-04-07
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service, object);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service, object);
        b.setName("B");
        b.start();


    }
}
