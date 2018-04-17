package com.tz3.waitOld;

import com.sun.beans.decoder.ValueObject;

/**
 * create by tz on 2018-04-13
 */
public class Add {
    private String lock;

    public Add(String lock) {
        super();
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            lock.notifyAll();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
