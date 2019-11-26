package com.weather.city;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by chentingting on 2017/12/2.
 */
public class PublicName {
//    private String city;
//    private int citynum;
//    private static int val;
    private static HashMap<String , Integer> hashMap;
    private static HashMap<Integer, Integer> valMap;
    private static ArrayList<String> list = new ArrayList<String>();


    public static String getCityName(int citynum) {
        list.add("厦门");
        list.add("北京");
        list.add("上海");
        list.add("深圳");
        list.add("zhuhai");
        list.add(" ");
        System.out.println(list.get(citynum));
        return list.get(citynum);
    }

    public static void setCityValue(String cityname, int num) {
        hashMap = new HashMap<String , Integer>();
        hashMap.put(cityname, num);
    }
    public static int getCityValue(String cityname){
        return hashMap.get(cityname);
    }


    public static void setVal(int val,int a){
        valMap = new HashMap<Integer, Integer>();
        valMap.put(val, a);
//        this.val = val;
    }
    public static int getVal(int val){

        return valMap.get(val);
    }

}
