package com.tz2.synch.dirtyRead;

/**
 * create by tz on 2018-03-26
 */
public class DirtyReadTestThread extends Thread{
    private PublicVar publicVar;
    public DirtyReadTestThread(PublicVar publicVar){
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
}
