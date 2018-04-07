package com.tz2.synch.lockTest2;

/**
 * create by tz on 2018-03-22
 */
public class Run {
    public static void main(String[] args) {
        LockTestObject object = new LockTestObject();
        LockThreadA threadA = new LockThreadA(object);
        threadA.setName("A");
        LockThreadB threadB = new LockThreadB(object);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
