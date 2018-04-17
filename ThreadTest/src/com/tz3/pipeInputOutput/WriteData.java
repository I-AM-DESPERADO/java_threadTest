package com.tz3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * create by tz on 2018-04-16
 */
public class WriteData {

    /**
     * Method writeMethod
     *
     *
     * @param out
     */
    public void writeMethod(PipedOutputStream out) {
        try {
            System.out.println("write:");

            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                System.out.println("for里面");
                out.write(outData.getBytes());
                System.out.println(outData);
            }
            System.out.println("for下面一行");

            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
