package com.tz.shareThread;

/**
 * create by tz on 2018-03-17
 */
public class ShareThread2 extends Thread {
    private int i = 5;
    @Override
    public void run(){
        System.out.println("i="+ (i--) +",threadName="+Thread.currentThread().getName());
    //i--在println之前执行，故可能发生非线程安全问题
    }

    public static void main(String[] args) {
        ShareThread2 run = new ShareThread2();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);
        Thread t5 = new Thread(run);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
