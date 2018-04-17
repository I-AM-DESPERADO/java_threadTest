package com.tz3.test2;

/**
 * create by tz on 2018-04-12
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("syn上面");
            synchronized (lock) {
                System.out.println("syn第一行");
                lock.wait();
                System.out.println("wait下的代码！");
            }
            System.out.println("syn下面代码");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
