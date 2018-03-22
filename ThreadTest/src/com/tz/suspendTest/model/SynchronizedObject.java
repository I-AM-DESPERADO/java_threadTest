package com.tz.suspendTest.model;

/**
 * create by tz on 2018-03-20
 */
public class SynchronizedObject {
    synchronized public void printString(){
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("a线程永久陷入沉睡！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
