package com.tz.StopThread;

/**
 * create by tz on 2018-03-18
 */
public class ReturnStopThread extends Thread{

    @Override
    public void run() {
        while(true){
            if (this.isInterrupted()){
                System.out.println("停止！");
                return;
            }
            System.out.println("timer = "+System.currentTimeMillis());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReturnStopThread thread = new ReturnStopThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}
