package com.tz2.synch.deadLockTest;

import com.tz2.synch.synBlockLockAll.ThreadA;

/**
 * create by tz on 2018-04-07
 */
public class DeadThread implements Runnable {
    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setFlag(String username){
        this.username = username;
    }
    @Override
    public void run() {
        if (username.equals("a")){
            synchronized (lock1){
                try {
                    System.out.println("username = " + username);
                    ThreadA.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("按Lock1->Lock2代码顺序执行！");
                }
            }
        }
        if (username.equals("b")) {
            synchronized (lock2){
                try {
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("按Lock2->Lock1代码顺序执行！");
                }
            }

        }

    }
}
