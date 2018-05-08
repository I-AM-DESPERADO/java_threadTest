package com.tz7.groupAddThread;

/**
 * create by tz on 2018-05-08
 */
public class Run {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        ThreadA     aRunnable = new ThreadA();
        ThreadB     bRunnable = new ThreadB();
        ThreadGroup group     = new ThreadGroup("Tzs线程组");
        Thread      aThread   = new Thread(group, aRunnable);
        Thread      bThread   = new Thread(group, bRunnable);

        aThread.start();
        bThread.start();
        System.out.println("活动的线程数为:" + group.activeCount());
        System.out.println("线程组名称为：" + group.getName());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
