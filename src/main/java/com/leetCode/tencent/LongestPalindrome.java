package com.leetCode.tencent;

/**
 * Created by chentingting07 on 2019/11/23.
 */
public class LongestPalindrome {
    public static void main(String[] args){
        String s = "a";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        String lp = "";
        for (int x= 0; x<s.length(); x++){
            for(int y=x+1; y<=s.length(); y++){
                String sub = s.substring(x, y);
                StringBuilder sb = new StringBuilder(sub);
                String temp =sb.reverse().toString();
                if(sub.equals(temp)){
                    if(lp.length() <= sub.length()){
                        lp = sub;
                    }
                }
            }
        }
        return lp;
    }
}
