package com.tz3.TowThreadData;

/**
 * create by tz on 2018-04-11
 */
public class ThreadB extends Thread {
    private MyList list;
    public ThreadB(MyList list) {
        super();
        this.list = list;
    }
    @Override
    public void run() {
        System.out.println("threadB运行了");
        try {
            while (true) {
                //System.out.println("ThreadB while进入  list.size() = " + list.size());
            if (list.size() == 5) {
                //System.out.println("ThreadB while进入  list.size() = " + list.size());
                System.out.println("==5了，线程b要退出啦");
                throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("进入异常！");
            e.printStackTrace();
        }
    }
}
