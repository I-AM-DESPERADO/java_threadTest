package com.tz2.synch.synCodeBlock2;

/**
 * create by tz on 2018-04-02
 */
public class Task {
    private String getData1;
    private String getData2;

    public synchronized void doLongTimeTask(){
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            String privateGetData1 = "长时间处理任务后从远程返回值1  threadname = "+Thread.currentThread().getName();
            String  privateGetData2 = "长时间处理任务后从远程返回值2  threadname = "+Thread.currentThread().getName();
            synchronized (this){
                getData1 = privateGetData1;
                getData2 = privateGetData2;
            }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
