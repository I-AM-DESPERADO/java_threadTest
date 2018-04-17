package com.tz3.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;

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
    public void readMethod(PipedReader input) {
        try {
            System.out.println("read:");

            char[] byteArray  = new char[20];
            int    readLength = input.read(byteArray);

            while (readLength != -1) {
                String newData = new String(byteArray, 0, readLength);

                System.out.println(newData);
                readLength = input.read(byteArray);
            }

            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
