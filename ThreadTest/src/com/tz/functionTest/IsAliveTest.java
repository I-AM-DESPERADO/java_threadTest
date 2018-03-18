package com.tz.functionTest;


/**
 * create by tz on 2018-03-18
 */
public class IsAliveTest extends Thread {
    @Override
    public void run() {
        System.out.println("run = "+this.isAlive());
    }

    public static void main(String[] args) throws InterruptedException {
        IsAliveTest i = new IsAliveTest();
        System.out.println("start =="+i.isAlive());
        i.start();
        Thread.sleep(1000);
        System.out.println("end =="+i.isAlive());
    }
}
