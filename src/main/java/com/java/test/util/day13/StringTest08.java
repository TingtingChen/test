package com.java.test.util.day13;

/**
 * Created by chentingting on 2019/11/11.
 */
public class StringTest08 {
    public static void main(String[] args){
         StringDemo02.sop(subStringCount("kk","abkkcdkkefkkskk"));
    }
    public static int subStringCount(String subString, String s){
        int count = 0;
        int temp = 0;
        //方法一
//        for (int i = 0; i < s.length(); i++ ){
//            if(s.indexOf(subString, temp)!=-1){
//                count++;
//                temp = s.indexOf(subString, temp) + subString.length();
//            }
//            else break;
//        }
        //方法二
        while((temp = s.indexOf(subString,temp))!=-1){
            count++;
            temp = temp + subString.length();
        }
        return count;
    }
}
