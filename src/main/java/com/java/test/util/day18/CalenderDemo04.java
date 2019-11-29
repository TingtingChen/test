package com.java.test.util.day18;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by chentingting07 on 2019/11/23.
 */
public class CalenderDemo04 {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
//        c.set(2020, 1, 1);
//        printCalendar(c);
//        c.add(Calendar.YEAR, 1);
//        printCalendar(c);
//
//        System.out.println(getDaysOfMonth(c, 2019));

        System.out.println(getYesterdayTime(c));

    }

    public static String printCalendar(Calendar c){
        Date date = new Date();
        String[] s = {"一月" , "二月" , "三月" , "四月" ,
                "五月" , "六月" , "七月" , "八月" ,
                "九月" , "十月" , "十一月" , "十二月" };
        String[] s2 = {"" , "星期日" , "星期一" , "星期二" , "星期三" , "星期四", "星期五","星期六"};
        return (c.get(Calendar.YEAR) +"年"+ s[c.get(Calendar.MONTH)] +
                + c.get(Calendar.DAY_OF_MONTH) +"日"+ s2[c.get(Calendar.DAY_OF_WEEK)]);
    }

    public static int getDaysOfMonth(Calendar c, int year){
        c.set(year, 2, 1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        return c.get(Calendar.DAY_OF_MONTH);
    }

    public static String getYesterdayTime(Calendar c){
        c.add(Calendar.DAY_OF_MONTH, -1);
        return printCalendar(c) +" " + c.get(Calendar.HOUR_OF_DAY) +":"+ c.get(Calendar.MINUTE) +":" +c.get(Calendar.SECOND);
    }
}
