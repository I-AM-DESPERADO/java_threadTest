package com.tz6.singleton_8;

/**
 * create by tz on 2018-05-06
 */
public class MyObject {

    /** Field instance */
    private static MyObject instance = null;

    static {
        instance = new MyObject();
    }

    /**
     * Constructs MyObject
     *
     */
    private MyObject() { }

    /**
     * Method getInstance
     *
     *
     * @return
     */
    public static MyObject getInstance() {
        return instance;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
