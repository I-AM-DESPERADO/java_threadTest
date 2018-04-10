package com.tz2.synch.stringAndSyn;

/**
 * create by tz on 2018-04-07
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
      //  service.print("AA");
        service.print(new Object());
    }
}
