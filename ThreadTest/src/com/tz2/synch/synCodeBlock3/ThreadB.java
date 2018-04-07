package com.tz2.synch.synCodeBlock3;

/**
 * create by tz on 2018-04-02
 */
public class ThreadB extends Thread {
    private Task task;
    public ThreadB(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
