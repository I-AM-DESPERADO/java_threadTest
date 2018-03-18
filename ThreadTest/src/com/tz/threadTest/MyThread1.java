package com.tz.threadTest;

/**
 * create by tz on 2018-03-16
 */
public class MyThread1 extends Thread {

    @Override
    public void run(){
        try {
            for (int i = 0;i < 10;i++){
            int time = (int) (Math.random()*1000);
            Thread.sleep(time);
            System.out.println("run:"+Thread.currentThread().getName());
            }
        }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    public static void main(String[] args) throws InterruptedException {
        MyThread1 thread = new MyThread1();
        thread.setName("myThread");
        thread.start();
        for (int i = 0; i<10;i++){
            int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main:"+Thread.currentThread().getName());
        }

    }
}
