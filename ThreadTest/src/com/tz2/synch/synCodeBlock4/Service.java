package com.tz2.synch.synCodeBlock4;

/**
 * create by tz on 2018-04-06
 */
public class Service {
    private String userNameParam;
    private String passwordParam;
    public void setUserNamePassword(String userName, String password) {
        try {
            String anyString = new String();
            synchronized (anyString) {
                System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "毫秒进入同步块");
                userNameParam = userName;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "毫秒离开同步块");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
