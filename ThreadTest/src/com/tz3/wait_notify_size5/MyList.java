package com.tz3.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * create by tz on 2018-04-12
 */
public class MyList {
    private static List list = new ArrayList();
    public static void add() {
        list.add("anyString");
    }
    public static int size() {
        return list.size();
    }
}
