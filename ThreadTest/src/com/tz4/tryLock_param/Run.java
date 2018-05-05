package com.tz4.tryLock_param;

/**
 * create by tz on 2018-04-29
 */
public class Run {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        final MyService service     = new MyService();
        Runnable        runnableRef = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "调用waitMethod时间： " + System.currentTimeMillis());
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnableRef);

        threadA.setName("A ");
        threadA.start();

        Thread threadB = new Thread(runnableRef);

        threadB.setName("B ");
        threadB.start();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
