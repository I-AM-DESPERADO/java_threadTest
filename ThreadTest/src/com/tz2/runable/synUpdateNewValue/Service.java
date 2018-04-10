package com.tz2.runable.synUpdateNewValue;

/**
 * create by tz on 2018-04-10
 */
public class Service {
    private boolean isContinueRun = true;
    public void runMethod() {
        String anything = new String();
        while (isContinueRun) {
            synchronized (anything) {

            }
        }
        System.out.println("停下来了！");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}
