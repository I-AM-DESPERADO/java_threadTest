package com.tz2.synch.towStop;

/**
 * create by tz on 2018-04-07
 */
public class Service {
    public  void methodA(Object object) {
        synchronized (object) {
            System.out.println("methodA begin!");
            Boolean isContinueRun = true;
            while (isContinueRun) {
             //   System.out.println("In while");
            }
            System.out.println("methodA end!");
        }

    }

    public void methodB(Object object) {
        synchronized (object) {
            System.out.println("methodB begin!");
            System.out.println("methodB end!");
        }


    }
}
