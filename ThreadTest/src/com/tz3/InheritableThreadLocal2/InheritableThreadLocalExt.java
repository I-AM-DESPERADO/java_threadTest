package com.tz3.InheritableThreadLocal2;

import java.util.Date;

/**
 * Class InheritableThreadLocalExt
 *
 *
 * @version        1.0, 18/04/21
 * @author         tz
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + "  我在子线程加的~~~";
    }

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
