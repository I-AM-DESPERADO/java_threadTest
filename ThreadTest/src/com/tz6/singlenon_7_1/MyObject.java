package com.tz6.singlenon_7_1;

import java.io.Serializable;

/**
 * create by tz on 2018-05-05
 */
public class MyObject implements Serializable {

    /** Field serialVersionUID */
    private static final long serialVersionUID = 888L;

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

    protected  Object readResolve() {
        System.out.println("调用了readResolve方法！");
        return MyObjectHandler.myObject;
    }

    /**
     * Class MyObjectHandler
     *
     *
     * @version        Enter version here..., 18/05/05
     * @author         Enter your name here...
     */
    private static class MyObjectHandler {

        /** Field myObject */
        private static final MyObject myObject = new MyObject();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
