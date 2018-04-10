package com.tz2.synch.setNewStringTowLock;

/**
 * create by tz on 2018-04-10
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");

        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadA.start();
        //Thread.sleep(50);
        threadB.start();
    }
}
