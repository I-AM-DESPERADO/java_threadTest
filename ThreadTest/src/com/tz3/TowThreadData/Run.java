package com.tz3.TowThreadData;

/**
 * create by tz on 2018-04-11
 */
public class Run {
    public static void main(String[] args) {
        MyList list = new MyList();
        Thread a = new ThreadA(list);
        a.setName("A");
        a.start();
        Thread b = new ThreadB(list);
        b.setName("B");
        b.start();
        //System.out.println("list.size() = " + list.size());
    }
}
