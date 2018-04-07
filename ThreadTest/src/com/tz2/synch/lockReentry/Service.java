package com.tz2.synch.lockReentry;

/**
 * create by tz on 2018-03-26
 */
public class Service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized public void service2(){
        System.out.println("service2");
        service3();
    }
    synchronized public void service3(){
        System.out.println("service3");
    }
}
