package com.tz5.timerTask2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * create by tz on 2018-05-04
 */
public class Run2 {

    /**
     * Method main
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            MyTaskA          task1      = new MyTaskA();
            MyTaskB          task2      = new MyTaskB();
            SimpleDateFormat sdf        = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String           dateString = "2018-05-04 14:48:00";
            Timer            timer      = new Timer();
            Date             dateRef    = sdf.parse(dateString);

            System.out.println("字符串时间：" + dateRef.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
            timer.schedule(task1, dateRef, 4000);
            timer.schedule(task2, dateRef, 4000);
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
    public static class MyTaskA extends TimerTask {
        @Override
        public void run() {
            System.out.println("A 运行了！ 时间为：" + new Date());
            this.cancel();
        }
    }


    /**
     * Class MyTaskB
     *
     *
     * @version        1.0, 18/05/04
     * @author         tz
     */
    public static class MyTaskB extends TimerTask {
        @Override
        public void run() {
            System.out.println("B 运行了！ 时间为：" + new Date());
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
