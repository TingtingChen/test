package com.java.test.util.day13;

/**
 * Created by chentingting on 2019/11/11.
 */
public class StringTest09 {
    public static void main(String[] args){
        String s1 = "sasdshellokjkjlk";
        String s2 = "sdfhellodxdkfj";
        StringDemo02.sop(getMaxSubString(s1, s2));
    }

    public static String getMaxSubString(String s1, String s2){
        String max = "",min="";
        max = (s1.length()>s2.length())?s1:s2;
        min = max==s1?s2:s1;
        for(int x = 0; x<min.length();x++){
            for(int start=0,end=min.length()-x; end!=min.length()+1; start++,end++){
                String temp = min.substring(start,end);
                if(max.contains(temp))
                    return temp;
            }
        }
        return "";
    }
}
