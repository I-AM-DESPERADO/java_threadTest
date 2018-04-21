package com.tz.suspendTest;

/**
 * create by tz on 2018-03-20
 */
public class SuspendTestThread extends Thread {
    private long i = 0;
    public long getI(){
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }


    public static void main(String[] args) {
        try {
            SuspendTestThread thread = new SuspendTestThread();
            thread.start();
            Thread.sleep(1000);
            //A段
            thread.suspend();
            System.out.println("线程暂停！");
            System.out.println("A= " +System.currentTimeMillis()+" i="+thread.getI());
            Thread.sleep(1000);
            System.out.println("A= " +System.currentTimeMillis()+" i="+thread.getI());

            //B段
            thread.resume();
            Thread.sleep(1000);
            System.out.println("线程唤醒！");
            System.out.println("B= " +System.currentTimeMillis()+" i="+thread.getI());
            Thread.sleep(1000);
            System.out.println("B= " +System.currentTimeMillis()+" i="+thread.getI());

            //c段
            thread.suspend();
            System.out.println("线程又暂停");
            System.out.println("C= " +System.currentTimeMillis()+" i="+thread.getI());
            Thread.sleep(1000);
            System.out.println("C= " +System.currentTimeMillis()+" i="+thread.getI());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
