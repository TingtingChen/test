package com.java.test.util.day18;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chentingting07 on 2019/11/23.
 */
public class DateDemo03 {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 E hh:mm:ss");
        String dateFormat = sdf.format(date);
        System.out.println(dateFormat);

        Date date1 = new Date(1);
        System.out.println(date1);
    }
}
