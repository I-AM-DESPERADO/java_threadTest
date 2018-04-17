package com.tz2.runable.synUpdateNewValue;

/**
 * create by tz on 2018-04-10
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB(service);
            b.start();
            System.out.println("已经发起停止命令！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
