package com.tz3.waitReleasetLock;

/**
 * create by tz on 2018-04-12
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b= new ThreadB(lock);
        b.start();
    }


}
