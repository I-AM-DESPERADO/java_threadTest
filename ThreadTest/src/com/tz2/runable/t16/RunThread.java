package com.tz2.runable.t16;

/**
 * create by tz on 2018-04-10
 */
public class RunThread extends Thread  {
    private volatile boolean isRunnable = true;

    public boolean isRunnable() {
        return isRunnable;
    }

    public void setRunnable(boolean runnable) {
        isRunnable = runnable;
    }

    @Override
    public void run() {
        System.out.println("进入run了！");
        while (isRunnable) {

        }
        System.out.println("线程被停止了！");
    }
}
