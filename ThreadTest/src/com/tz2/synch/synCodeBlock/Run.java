package com.tz2.synch.synCodeBlock;

/**
 * create by tz on 2018-04-02
 */
public class Run {

    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        SynCodeBlockTestThreadA threadA = new SynCodeBlockTestThreadA(service);
        threadA.setName("a");
        threadA.start();
        SynCodeBlockTestThreadB threadB = new SynCodeBlockTestThreadB(service);
        threadA.setName("b");
        threadB.run();
    }
}
