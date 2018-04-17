package com.tz3.test1;

/**
 * create by tz on 2018-04-12
 */
public class Test1 {
    public static void main(String[] args) {

        try {
            String newString = new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
