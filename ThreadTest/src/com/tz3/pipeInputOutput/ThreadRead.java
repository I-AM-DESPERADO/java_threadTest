package com.tz3.pipeInputOutput;

import java.io.PipedInputStream;

/**
 * create by tz on 2018-04-16
 */
public class ThreadRead extends Thread {

    /** Field read */
    private ReadData read;

    /** Field input */
    private PipedInputStream input;

    /**
     * Constructs ThreadRead
     *
     *
     * @param read
     * @param input
     */
    public ThreadRead(ReadData read, PipedInputStream input) {
        super();
        this.read  = read;
        this.input = input;
    }

    /**
     * Method run
     *
     */
    public void run() {
        read.readMethod(input);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
