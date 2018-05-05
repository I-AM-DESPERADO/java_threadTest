package com.tz5.timerTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * create by tz on 2018-05-04
 */
public class Run1TimerDaemon {

    /** Field timer */
    private static Timer timer = new Timer(true);

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        try {
            MyTask           task       = new MyTask();
            SimpleDateFormat sdf        = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String           dateString = "2018-05-04 08:46:00";
            Date             dateRef    = sdf.parse(dateString);

            System.out.println("字符串时间：" + dateRef.toLocaleString() + "当前时间：" + new Date().toLocaleString());
            timer.schedule(task, dateRef);
            Thread.sleep(3000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * Class MyTask
     *
     *
     * @version        1.0, 18/05/04
     * @author         tz
     */
    public static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
