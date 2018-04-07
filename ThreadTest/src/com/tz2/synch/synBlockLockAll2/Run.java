package com.tz2.synch.synBlockLockAll2;

/**
 * create by tz on 2018-04-07
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service, object);
        a.setName("A");
        a.start();
        Thread.sleep(100);
        ThreadB b = new ThreadB(object);
        b.setName("B");
        b.start();
    }
}
