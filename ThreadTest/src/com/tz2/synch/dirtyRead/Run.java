package com.tz2.synch.dirtyRead;

/**
 * create by tz on 2018-03-26
 */
public class Run {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            DirtyReadTestThread thread = new DirtyReadTestThread(publicVar);
            thread.start();
            Thread.sleep(200);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
