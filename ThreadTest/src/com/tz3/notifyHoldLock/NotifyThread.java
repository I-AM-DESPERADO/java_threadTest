package com.tz3.notifyHoldLock;

/**
 * create by tz on 2018-04-12
 */
public class NotifyThread extends Thread {
    private Object lock;
    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);

    }
}
