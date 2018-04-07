package com.tz2.synch.lockReentry;

/**
 * create by tz on 2018-03-26
 */
public class LockReentryTestThread  extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
