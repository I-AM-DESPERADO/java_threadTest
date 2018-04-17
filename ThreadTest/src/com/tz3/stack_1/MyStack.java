package com.tz3.stack_1;

import java.util.ArrayList;
import java.util.List;

/**
 * create by tz on 2018-04-15
 */
public class MyStack {

    /** Field list */
    private List list = new ArrayList();

    /**
     * Method pop
     *
     *
     * @return
     */
    public synchronized String pop() {
        String returnValue = "";

        try {
            if (list.size() == 0) {
                System.out.println("pop操作过程中的： " + Thread.currentThread().getName() + "  线程呈wait状态");
                this.wait();
            }

            returnValue = "" + list.get(0);
            list.remove(0);
            this.notify();
            System.out.println("pop = " + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return returnValue;
    }

    /**
     * Method push
     *
     */
    public synchronized void push() {
        try {
            if (list.size() == 1) {
                this.wait();
            }

            list.add("anything = " + Math.random());
            this.notify();
            System.out.println("push = " + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
