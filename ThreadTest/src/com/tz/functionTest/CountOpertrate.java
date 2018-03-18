package com.tz.functionTest;

/**
 * create by tz on 2018-03-18
 */
public class CountOpertrate extends Thread {
    public CountOpertrate(){
        System.out.println("CountOpertate-build-start");
        System.out.println("Thread.currentThread().getName() = "+Thread.currentThread().getName());
        System.out.println("this.getName()"+this.getName());
        System.out.println("CountOpertrate-build-end");
    }

    @Override
    public void run(){
        System.out.println("run-start");
        System.out.println("Thread.currentThread().getName() = "+Thread.currentThread().getName());
        System.out.println("this.getName()"+this.getName());
        System.out.println("run-end");
    }


    public static void main(String[] args) {
        CountOpertrate countOpertrate = new CountOpertrate();
        Thread t = new Thread(countOpertrate);
        t.setName("TEST");
        t.start();
    }
}
