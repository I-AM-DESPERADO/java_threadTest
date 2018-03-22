package com.tz.priorityTest;

import java.util.Random;

/**
 * create by tz on 2018-03-20
 */
public class PriorityTestThread1 extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int j = 0;j < 10;j++){
            for(int i = 0;i<50000;i++){
                Random random = new Random();
                random.nextInt();
                addResult = addResult+1;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("* * * * * * thread 2 use time="+(endTime - beginTime));
    }
}
