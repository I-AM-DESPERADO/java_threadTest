package com.tz.priorityTest;

/**
 * create by tz on 2018-03-20
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0;i < 100;i++){
            PriorityTestThread thread1 = new PriorityTestThread();
            thread1.setPriority(10);
            thread1.start();
            PriorityTestThread1 thread2 = new PriorityTestThread1();
            thread2.setPriority(1);
            thread2.start();
        }
    }

}
