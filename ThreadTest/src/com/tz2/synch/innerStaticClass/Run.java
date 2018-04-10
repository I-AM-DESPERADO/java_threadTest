package com.tz2.synch.innerStaticClass;

/**
 * create by tz on 2018-04-09
 */
public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername() + "  " + publicClass.getPassword());
        PublicClass.PrivateClass privateClass = new PublicClass.PrivateClass();
        privateClass.setAge("AgeValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge() + "   " + privateClass.getAddress());
    }
}
