package com.tz6.singleton_1;

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
        if (myObject != null) { }
        else {
            myObject = new MyObject();
        }

        return myObject;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
