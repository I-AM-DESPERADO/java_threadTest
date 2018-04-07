package com.tz2.synch.synTest2;

import java.util.ArrayList;
import java.util.List;


/**
 * create by tz on 2018-04-07
 */
public class MyOneList {
    private List list = new ArrayList();
    public synchronized void add(String data) {
        list.add(data);
    }

    public synchronized int getSize() {
        return list.size();
    }

}
