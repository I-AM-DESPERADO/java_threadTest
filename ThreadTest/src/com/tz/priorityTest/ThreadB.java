package com.tz.priorityTest;

/**
 * create by tz on 2018-03-21
 */
public class ThreadB extends Thread{

    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true){
            count++;
        }
    }
}
