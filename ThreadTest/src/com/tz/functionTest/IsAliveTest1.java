package com.tz.functionTest;

/**
 * create by tz on 2018-03-18
 */
public class IsAliveTest1 extends Thread {

    public IsAliveTest1(){
        System.out.println("IsAliveTest1-Start");
        System.out.println("Thread.currentThread().getName() = "+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() = "+Thread.currentThread().isAlive());
        System.out.println("this.getName() = "+this.getName());
        System.out.println("this.isAlive() = "+this.isAlive());
        System.out.println("IsAliveTest1-end");
    }
    @Override
    public void run(){
        System.out.println("run-Start");
        System.out.println("Thread.currentThread().getName() = "+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() = "+Thread.currentThread().isAlive());
        System.out.println("this.getName() = "+this.getName());
        System.out.println("this.isAlive() = "+this.isAlive());
        System.out.println("run-end");
    }

    public static void main(String[] args) throws InterruptedException {
        IsAliveTest1 test1 = new IsAliveTest1();
        Thread t1 = new Thread(test1);
        System.out.println("main bigin t1 isAlive = "+t1.isAlive());
        t1.setName("AAA");
        t1.start();
        Thread.sleep(1000);
        System.out.println("main end t1 isAlive = "+t1.isAlive());
    }
}
