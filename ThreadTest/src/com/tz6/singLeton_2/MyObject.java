package com.tz6.singLeton_2;

/**
 * create by tz on 2018-05-05
 */
public class MyObject {

    /** Field myObject */
    private static MyObject myObject;

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
     */
    public static MyObject getInstance() {
        try {
            if (myObject != null) { }
            else {

                // 模仿在创建对象时的一些准备工作
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    if (myObject == null) {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return myObject;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
