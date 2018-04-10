package com.tz2.runable.volatileTestThread;

/**
 * create by tz on 2018-04-10
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] myThreadArray = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreadArray[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThreadArray[i].start();
        }

    }
}
