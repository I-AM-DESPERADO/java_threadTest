package com.tz2.runable.t10;

/**
 * create by tz on 2018-04-10
 */
public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        System.out.println("我要停止它！stopThread = " + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);

    }

}
