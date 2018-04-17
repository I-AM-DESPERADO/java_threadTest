package com.tz3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * create by tz on 2018-04-16
 */
public class ReadData {

    /**
     * Method readMethod
     *
     *
     * @param input
     */
    public void readMethod(PipedInputStream input) {
        try {
            System.out.println("read :");

            byte[] byteArray  = new byte[20];
            int    readLength = input.read(byteArray);

            while (readLength != -1) {
                System.out.println("while里面read");
                String newData = new String(byteArray, 0, readLength);

                System.out.println(newData);
                readLength = input.read(byteArray);
            }
            System.out.println("while下面一行");
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
