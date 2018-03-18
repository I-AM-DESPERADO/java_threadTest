package com.tz.shareThread;

/**
 * create by tz on 2018-03-17
 */
public class ShareThread1 extends Thread {
    private int count  = 10;

    @Override
    synchronized public void run(){
        super.run();
        count--;
        //不要使用for语句，因为使用同步后线程就没有运行机会了
        //一直由线程进行减法运算
        System.out.println("由"+Thread.currentThread().getName()+"计算，count="+count);
    }

    public static void main(String[] args){
        ShareThread1 thread1 = new ShareThread1();
        Thread a = new Thread(thread1,"A");
        Thread b = new Thread(thread1,"B");
        Thread c = new Thread(thread1,"C");
        Thread d = new Thread(thread1,"D");
        Thread e = new Thread(thread1,"E");
        Thread f = new Thread(thread1,"F");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();
    }

}
