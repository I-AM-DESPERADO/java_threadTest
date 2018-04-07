package com.tz2.synch.synDisadvantage;

/**
 * create by tz on 2018-04-02
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        SynDisTestThread thread1 = new SynDisTestThread(task);
        thread1.start();
        SynDisTestThread2 thread2 = new SynDisTestThread2(task);
        thread2.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommonUtil.beginTime1;
        if (CommonUtil.beginTime2<CommonUtil.beginTime1){
            beginTime = CommonUtil.beginTime2;
        }
        long endTime = CommonUtil.endTime1;
        if (CommonUtil.endTime2 > CommonUtil.endTime1){
            System.out.println("耗时: "+((endTime-beginTime) / 1000));
        }

    }

}
