package com.tz2.runable.atomicIntegerNoSafe;

/**
 * create by tz on 2018-04-10
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyService service = new MyService();
            MyThread[] array = new MyThread[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = new MyThread(service);
            }
            for (int i = 0; i < array.length; i++) {
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(service.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
