package com.tz3.ThreadLocal33;

import java.util.Date;

/**
 * create by tz on 2018-04-19
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
