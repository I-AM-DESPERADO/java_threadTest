package com.tz2.synch.synTest;

/**
 * create by tz on 2018-04-06
 */
public class Service {
    private String anString = new String();
    public void a() {
        try {
            synchronized (anString){
                System.out.println("a  begin");
                Thread.sleep(3000);
                System.out.println("a   end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void b() {
        System.out.println("b  begin");
        System.out.println("b   end");
    }
}
