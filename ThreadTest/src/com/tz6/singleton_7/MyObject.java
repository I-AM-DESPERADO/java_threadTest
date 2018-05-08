package com.tz6.singleton_7;

/**
 * create by tz on 2018-05-05
 */
public class MyObject {

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
        return MyObjectHandler.myObject;
    }

    /**
     * Class MyObjectHandler
     *
     *
     * @version        1.0, 18/05/05
     * @author         tz
     */
    private static class MyObjectHandler {

        /** Field myObject */
        private static MyObject myObject = new MyObject();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
