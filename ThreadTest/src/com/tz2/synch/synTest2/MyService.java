package com.tz2.synch.synTest2;

import com.tz2.synch.synTest1.MyList;

/**
 * create by tz on 2018-04-07
 */
public class MyService {
    public MyOneList addServiceMethod(MyOneList list, String data) {
        try {
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
