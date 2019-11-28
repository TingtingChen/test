package com.leetcode.string;

/**
 * Created by chentingting on 2019/8/30.
 */
public class Solution {
    public String addBinary(String a, String b) {
        char[] cha = a.toCharArray();
        char[] chb = b.toCharArray();
        char[] base = {'0', '1'};
        StringBuilder sb = new StringBuilder();
        long sumA = 0;
        long sumB = 0;
        long sum = 0;
        for (int x=cha.length-1; x>=0; x--){
            sumA += Integer.parseInt(String.valueOf(cha[x])) * Math.pow(2, cha.length-1-x);
        }
        for (int y=chb.length-1; y>=0; y--){
            sumB += Integer.parseInt(String.valueOf(chb[y])) * Math.pow(2, chb.length-1-y);
        }
        sum = sumA + sumB;
        if (sum == 0){
            return "0";
        }

        while(sum!=0){
            sb.append(sum%2);
            sum = sum/2;
        }
        return sb.reverse().toString();
    }
}
