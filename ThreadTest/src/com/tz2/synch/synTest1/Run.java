package com.tz2.synch.synTest1;

/**
 * create by tz on 2018-04-06
 */
public class Run {
    public static void main(String[] args) {
        MyList list = new MyList();
        ThreadA a = new ThreadA(list);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(list);
        b.setName("B");
        b.start();
    }
}
