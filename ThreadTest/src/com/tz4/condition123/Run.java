package com.tz4.condition123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * create by tz on 2018-05-02
 */
public class Run {

    /** Field nextPrintWho */
    private static volatile int nextPrintWho = 1;

    /** Field lock */
    private static ReentrantLock lock = new ReentrantLock();

    /** Field conditionA */
    private static final Condition conditionA = lock.newCondition();

    /** Field conditionB */
    private static final Condition conditionB = lock.newCondition();

    /** Field conditionC */
    private static final Condition conditionC = lock.newCondition();

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        Thread threadA = new Thread() {
            public void run() {
                try {
                    lock.lock();

                    while (nextPrintWho != 1) {
                        conditionA.await();
                    }

                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadA " + (i + 1));
                    }

                    nextPrintWho = 2;
                    conditionB.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread threadB = new Thread() {
            public void run() {
                try {
                    lock.lock();

                    while (nextPrintWho != 2) {
                        conditionB.await();
                    }

                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThtradB " + (i + 1));
                    }

                    nextPrintWho = 3;
                    conditionC.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread threadC = new Thread() {
            public void run() {
                try {
                    lock.lock();

                    while (nextPrintWho != 3) {
                        conditionC.await();
                    }

                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadC " + (i + 1));
                    }

                    nextPrintWho = 1;
                    conditionA.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread[] aArray = new Thread[5];
        Thread[] bArray = new Thread[5];
        Thread[] cArray = new Thread[5];

        for (int i = 0; i < 5; i++) {
            aArray[i] = new Thread(threadA);
            bArray[i] = new Thread(threadB);
            cArray[i] = new Thread(threadC);
            aArray[i].start();
            bArray[i].start();
            cArray[i].start();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
