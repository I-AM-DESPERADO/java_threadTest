package com.tz4.ReadWriteLockBegin2;



/**
 * create by tz on 2018-05-02
 */
public class Run {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a       = new ThreadA(service);

        a.setName("A");

        ThreadB b = new ThreadB(service);

        b.setName("B");
        a.start();
        b.start();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
