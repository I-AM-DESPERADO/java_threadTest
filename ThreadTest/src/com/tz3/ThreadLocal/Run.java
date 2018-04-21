package com.tz3.ThreadLocal;

/**
 * create by tz on 2018-04-18
 */
public class Run {
    public static ThreadLocal tl = new ThreadLocal();
    public static void main(String[] args) {
        if (tl.get() == null) {
            System.out.println("从未放过值");
            tl.set("我的值");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }
}
