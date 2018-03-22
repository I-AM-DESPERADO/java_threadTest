package com.tz.priorityTest;

/**
 * create by tz on 2018-03-21
 */
public class Run1 {

    public static void main(String[] args) {
        try {
            ThreadA threadA = new ThreadA();
            threadA.setPriority(ThreadA.NORM_PRIORITY - 3);
            threadA.start();
            ThreadB threadB = new ThreadB();
            threadB.setPriority(ThreadB.NORM_PRIORITY + 3);
            threadB.start();
            Thread.sleep(10000);
            threadA.stop();
            threadB.stop();
            System.out.println("threadA = "+threadA.getCount());
            System.out.println("threadB = "+threadB.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
