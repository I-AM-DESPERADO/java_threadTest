package com.tz2.synch.test2;

/**
 * create by tz on 2018-03-22
 */
public class Run {
    synchronized public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }
}
