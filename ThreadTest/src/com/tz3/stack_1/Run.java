package com.tz3.stack_1;

/**
 * create by tz on 2018-04-15
 * 一消费一生产
 */
public class Run {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        MyStack  myStack = new MyStack();
        P        p       = new P(myStack);
        C        c       = new C(myStack);
        P_Thread pThread = new P_Thread(p);
        C_Thread cThread = new C_Thread(c);

        pThread.start();
        cThread.start();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
