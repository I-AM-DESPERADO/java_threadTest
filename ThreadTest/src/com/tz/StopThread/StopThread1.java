package com.tz.StopThread;

import com.tz.StopThread.model.SynchronizedObject;

/**
 * create by tz on 2018-03-18
 */
public class StopThread1 extends Thread {

    private SynchronizedObject object;

    public StopThread1(SynchronizedObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b","bb");
    }


    public static void main(String[] args) {

        try {
            SynchronizedObject object = new SynchronizedObject();
            StopThread1 thread1 = new StopThread1(object);
            thread1.start();
            Thread.sleep(500);
            thread1.stop();
            System.out.println("object.getUsername()="+object.getUsername());
            System.out.println("object.getPassword()="+object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
