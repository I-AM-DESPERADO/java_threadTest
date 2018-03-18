package com.tz.threadTest;

/**
 * create by tz on 2018-03-16
 */
public class MyThread extends Thread {

    @Override
    public void run(){
        super.run();
        System.out.println("MyThread");
    }
/**运行顺序存疑
 * 并没有发现随机性 */
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.run();
        System.out.println("mainThread");

    }
}
