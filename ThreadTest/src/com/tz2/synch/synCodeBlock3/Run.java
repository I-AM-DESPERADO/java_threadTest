package com.tz2.synch.synCodeBlock3;

/**
 * create by tz on 2018-04-02
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        threadA.start();
        ThreadB threadB = new ThreadB(task);
        threadB.start();
    }
}
