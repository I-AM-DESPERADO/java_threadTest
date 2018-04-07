package com.tz2.synch.synDisadvantage;

/**
 * create by tz on 2018-04-02
 */
public class SynDisTestThread  extends Thread{
    private Task task;
    public SynDisTestThread(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtil.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtil.endTime1 = System.currentTimeMillis();
    }
}
