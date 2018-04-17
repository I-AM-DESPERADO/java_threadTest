package com.tz3.notifyHoldLock;

/**
 * create by tz on 2018-04-12
 */
public class synNotifyMethodThread extends Thread {
    private Object lock;
    public synNotifyMethodThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
