package com.tz3.notifyHoldLock;

/**
 * create by tz on 2018-04-12
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
        synNotifyMethodThread c = new synNotifyMethodThread(lock);
        c.start();
    }
}
