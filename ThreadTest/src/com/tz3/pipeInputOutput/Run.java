package com.tz3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * create by tz on 2018-04-16
 *
 * 字节流通信
 */
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();

            inputStream.connect(outputStream);
//            outputStream.connect(inputStream);

            ThreadRead threadRead = new ThreadRead(readData, inputStream);
            threadRead.start();

            Thread.sleep(0);

            ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
            threadWrite.start();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
