package com.tz6.singleton_0;

/**
 * create by tz on 2018-05-05
 */
public class MyObject {

    // 立即加载方式==饿汉模式

    /** Field myObject */
    private static MyObject myObject = new MyObject();

    /**
     * Constructs MyObject
     *
     */
    private MyObject() {}

    /**
     * Method getInstance
     *
     *
     * @return
     *
     * 此代码版本为立即加载，此版本代码的缺点是不能有其他实例变量，
     * 因此getinstance()方法没有同步，所以可能出现非线程安全问题。
     */
    public static MyObject getInstance() {
        return myObject;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
