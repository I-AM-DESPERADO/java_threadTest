package com.tz3.wait_notify_insert_test;

/**
 * create by tz on 2018-04-17
 */
public class BackupB extends Thread {

    /** Field dbTools */
    private DBTools dbTools;

    /**
     * Constructs BackupB
     *
     *
     * @param dbTools
     */
    public BackupB(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
