package com.tz.StopThread;

/**
 * create by tz on 2018-03-18
 */
public class StopSleep2 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0;i<100000;i++){
                System.out.println("i = "+(i+1));
            }
            System.out.println("run-begin");
            Thread.sleep(200000);
            System.out.println("run-end");
        } catch (InterruptedException e) {
            System.out.println("先停止再遇到sleep，run()进入catch  "+this.isInterrupted());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

            StopSleep2 sleep2 = new StopSleep2();
            sleep2.start();
            sleep2.interrupt();
            System.out.println("end!");
    }

}
