package com.tz3.wait_notify_insert_test;

/**
 * create by tz on 2018-04-17
 */
public class BackupA extends Thread {

    /** Field dbTools */
    private DBTools dbTools;

    /**
     * Constructs BackupA
     *
     *
     * @param dbTools
     */
    public BackupA(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
