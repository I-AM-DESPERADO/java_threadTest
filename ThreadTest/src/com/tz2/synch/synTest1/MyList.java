package com.tz2.synch.synTest1;

import java.util.ArrayList;
import java.util.List;

/**
 * create by tz on 2018-04-06
 */
public class MyList {
    private List list = new ArrayList();
    public synchronized void add(String username){
        System.out.println("ThreadName = " + Thread.currentThread().getName() + "执行add方法！");
        list.add(username);
        System.out.println("ThreadName = "+ Thread.currentThread().getName() + "退出add方法！");
    }

    public synchronized int getSize() {
        System.out.println("ThreadName = " + Thread.currentThread().getName() + "执行getSize方法！");
        int sizeValue = list.size();
        System.out.println("ThreadName = " + Thread.currentThread().getName() + "退出getSize方法！");
        return sizeValue;
    }
}
