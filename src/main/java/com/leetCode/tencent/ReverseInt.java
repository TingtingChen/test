package com.leetCode.tencent;

/**
 * Created by chentingting07 on 2019/11/23.
 */
public class ReverseInt {
    public static void main(String[] args){
        int x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        String s = String.valueOf(x);
        char a = s.charAt(0);
        StringBuilder sbres = new StringBuilder();
        if(s.charAt(0)==45){
            StringBuilder sb = new StringBuilder(s.substring(1)+"-");
            sb.reverse();

            try{
                return Integer.parseInt(sb.toString());
            }catch (NumberFormatException e){
                return 0;
            }
        }
        else {
            sbres.append(s);
            sbres.reverse();
            try{
                return Integer.parseInt(sbres.toString());
            }catch (NumberFormatException e){
                return 0;
            }
        }
    }
}
