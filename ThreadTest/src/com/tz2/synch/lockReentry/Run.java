package com.tz2.synch.lockReentry;


/**
 * create by tz on 2018-03-26
 */
public class Run {
    public static void main(String[] args) {
        LockReentryTestThread thread = new LockReentryTestThread();
        thread.start();
    }
}
