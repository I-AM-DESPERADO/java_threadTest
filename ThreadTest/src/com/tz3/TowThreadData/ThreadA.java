package com.tz3.TowThreadData;



/**
 * create by tz on 2018-04-11
 */
public class ThreadA extends Thread {
    private MyList list;
    public ThreadA(MyList list) {
        super();
        this.list = list;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                list.add();
                System.out.println("添加了" + (i + 1) + "个元素");
                System.out.println("list.size() = " + list.size());
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
