package com.tz2.synch.dirtyRead;

/**
 * create by tz on 2018-03-26
 */
public class PublicVar {
    /**
     * 用户名
     * 密码
     */
    public String userName = "A";
    public String password = "AA";
    synchronized public void setValue(String userName, String password){
        try {
            this.userName = userName;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name = "+ Thread.currentThread().getName()+ " userName = "+ userName+ " password = "+ password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
   synchronized public void getValue(){
        System.out.println("setValue method thread name = "+ Thread.currentThread().getName()+ "userName = "+ userName+ " password = "+ password);
    }
}
