package com.tz3.wait_notify_size5;

/**
 * create by tz on 2018-04-12
 */
public class ThreadB implements Runnable {
    private Object lock;
    public ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    //System.out.println(MyList.size());
                    if (MyList.size() == 5) {
                        lock.notify();
                        System.out.println("已发出通知！");
                    }
                    System.out.println("添加了 " + (i + 1) + " 个元素");
                    Thread.sleep(1000);

                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
