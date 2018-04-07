package com.tz2.synch.synStaticMethod;

/**
 * create by tz on 2018-04-07
 */
public class Run {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();
    }
}
