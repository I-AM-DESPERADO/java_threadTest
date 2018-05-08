package com.tz6.singlenon_7_1;

import java.io.*;

/**
 * create by tz on 2018-05-05
 */
public class SaveAndRead {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            MyObject           myObject = MyObject.getInstance();
            FileOutputStream   fosRef   = new FileOutputStream(new File("myObjectFile.txt"));
            ObjectOutputStream oosRef   = new ObjectOutputStream(fosRef);

            oosRef.writeObject(myObject);
            oosRef.close();
            fosRef.close();
            System.out.println(myObject.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream   fisRef   = new FileInputStream(new File("myObjectFile.txt"));
            ObjectInputStream iosRef   = new ObjectInputStream(fisRef);
            MyObject          myObject = (MyObject) iosRef.readObject();

            iosRef.close();
            fisRef.close();
            System.out.println(myObject.hashCode());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
