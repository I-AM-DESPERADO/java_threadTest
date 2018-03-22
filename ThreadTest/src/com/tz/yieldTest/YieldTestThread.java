package com.tz.yieldTest;

/**
 * create by tz on 2018-03-20
 */
public class YieldTestThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0;i < 50000000; i++){
            Thread.yield();
            count = count + (i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时："+(endTime-beginTime)+"毫秒");
    }


    public static void main(String[] args) {
        YieldTestThread thread = new YieldTestThread();
        thread.start();
    }
}
