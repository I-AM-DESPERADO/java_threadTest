package com.tz3.InheritableThreadLocal1;

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
    protected Object initialValue() {
        return new Date().getTime();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
