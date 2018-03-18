package com.tz.StopThread;

/**
 * create by tz on 2018-03-18
 */
public class StopThread extends Thread {

    private int i = 0;

    @Override
    public void run() {
        try {
            while (true){
                i++;
                System.out.println("i=" +i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            StopThread thread = new StopThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
            System.out.println("stop暴力停止");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
