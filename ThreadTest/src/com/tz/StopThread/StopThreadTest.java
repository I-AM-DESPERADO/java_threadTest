package com.tz.StopThread;

/**
 * create by tz on 2018-03-18
 */
public class StopThreadTest extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i=0;i<1000000;i++){
                if (this.isInterrupted()){
                    System.out.println("已是停止状态，线程退出！");
                    throw new InterruptedException();
                }
                System.out.println("i = "+(i+1));
            }
            System.out.println("for下面的");
        } catch (InterruptedException e) {
            System.out.println("线程run()方法catch！线程异常终止");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        try {
            StopThreadTest test = new StopThreadTest();
            test.start();
            Thread.sleep(1000);
            test.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main  catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }

}
