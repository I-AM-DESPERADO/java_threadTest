package com.tz2.synch.synDisadvantage;

/**
 * create by tz on 2018-04-02
 */
public class SynDisTestThread2 extends Thread {
    private Task task;
    public SynDisTestThread2(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtil.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtil.endTime2 = System.currentTimeMillis();
    }
}
