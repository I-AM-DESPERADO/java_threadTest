package com.tz2.synch.innerStaticClass;

/**
 * create by tz on 2018-04-09
 */
public class PublicClass {
    private static String username;
    private static String password;

    static class PrivateClass {
        private String age;
        private String address;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        PublicClass.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        PublicClass.password = password;
    }
}
