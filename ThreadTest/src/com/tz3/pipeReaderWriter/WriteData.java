package com.tz3.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedWriter;

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
    public void writeMethod(PipedWriter out) {
        try {
            System.out.println("write:");

            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);

                out.write(outData);
                System.out.println(outData);
            }

            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
