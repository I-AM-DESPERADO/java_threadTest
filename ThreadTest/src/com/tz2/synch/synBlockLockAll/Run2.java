package com.tz2.synch.synBlockLockAll;

/**
 * create by tz on 2018-04-07
 */
public class Run2 {

    public static void main(String[] args) {
        Service service = new Service();
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();
        ThreadA a = new ThreadA(service, object1);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service, object2);
        b.setName("B");
        b.start();
    }
}
