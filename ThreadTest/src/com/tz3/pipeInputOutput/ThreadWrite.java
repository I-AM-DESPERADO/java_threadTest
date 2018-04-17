package com.tz3.pipeInputOutput;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * create by tz on 2018-04-16
 */
public class ThreadWrite extends Thread {

    /** Field write */
    private WriteData write;

    /** Field out */
    private PipedOutputStream out;

    /**
     * Constructs ThreadWrite
     *
     *
     * @param write
     * @param out
     */
    public ThreadWrite(WriteData write, PipedOutputStream out) {
        super();
        this.write = write;
        this.out   = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
