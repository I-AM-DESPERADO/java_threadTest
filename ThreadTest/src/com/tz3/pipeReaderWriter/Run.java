package com.tz3.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * create by tz on 2018-04-17
 */
public class Run {
    public static void main(String[] args) {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();

        PipedReader inputStream = new PipedReader();
        PipedWriter outputStream = new PipedWriter();

        try {
            //inputStream.connect(outputStream);
            outputStream.connect(inputStream);

            ThreadRead threadRead = new ThreadRead(readData, inputStream);
            threadRead.start();

            Thread.sleep(2000);

            ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
            threadWrite.start();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}