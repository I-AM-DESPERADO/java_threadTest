package com.tz.shareThread;

/**
 * create by tz on 2018-03-16
 */
public class ShareThread extends Thread{
    private int count = 5;
    public ShareThread(String name){
        super();
        this.setName(name);
    }
    @Override
    public void run(){
        super.run();
        while (count >0){
            count--;
            System.out.println("由"+Thread.currentThread().getName()+"计算,count="+count);
        }
    }

    public static void main(String[] args){
        ShareThread shareThread1 = new ShareThread("A");
        ShareThread shareThread2 = new ShareThread("B");
        ShareThread shareThread3 = new ShareThread("C");
        shareThread1.start();
        shareThread2.start();
        shareThread3.start();


    }
}
