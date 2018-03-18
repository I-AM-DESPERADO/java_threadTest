package com.tz.runableTest;

/**
 * create by tz on 2018-03-16
 */
public class RunableTest implements Runnable {

    @Override
    public void run() {
        System.out.println("Runable线程运行中:"+Thread.currentThread().getName());
    }

    public static void main(String[] arg){
        RunableTest runableTest = new RunableTest();
        Thread thread = new Thread(runableTest);
        thread.start();
        System.out.println("mainThread:"+Thread.currentThread().getName() );


    }
}
