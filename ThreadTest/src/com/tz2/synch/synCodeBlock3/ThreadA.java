package com.tz2.synch.synCodeBlock3;

/**
 * create by tz on 2018-04-02
 */
public class ThreadA extends Thread{
    private Task task;
    public ThreadA(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
