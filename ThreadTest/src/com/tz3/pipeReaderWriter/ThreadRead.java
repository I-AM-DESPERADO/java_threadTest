package com.tz3.pipeReaderWriter;

import java.io.PipedReader;

/**
 * create by tz on 2018-04-16
 */
public class ThreadRead extends Thread {

    /** Field read */
    private ReadData read;

    /** Field input */
    private PipedReader input;

    /**
     * Constructs ThreadRead
     *
     *
     * @param read
     * @param input
     */
    public ThreadRead(ReadData read, PipedReader input) {
        super();
        this.read  = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
