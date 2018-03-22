package com.tz.suspendTest.model;

/**
 * create by tz on 2018-03-20
 */
public class MyObject {
    private String username = "l";
    private String password = "ll";
    public void setValue(String username,String password){
        this.username = username;
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("停止a线程！");
            Thread.currentThread().suspend();
        }
        this.password = password;
    }
    public void printUsernamePassword(){
        System.out.println(username+"  "+password);
    }
}
