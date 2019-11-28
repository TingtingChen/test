package com.java.test.util.day13;

/**
 * Created by chentingting on 2019/11/8.
 */
public class StringTest06 {
    public static void main(String[] args){
        String s = "   d sd  ";
        StringDemo02.sop("（" + s + "）");
//        s = myTrim(s);
//        StringDemo02.sop("（" + s + "）");
        StringDemo02.sop("（" + reverseString(s) + "）");

    }

    /**
     * 去除一个字符串两端的空格
     * @param s
     * @return
     */
    private static String myTrim(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ')
            start++;
        while (s.charAt(end) == ' ')
            end--;
        return s.substring(start, end+1);
    }

    /**
     * 将字符串中的部分字符反转
     * @param s
     * @param start
     * @param end
     * @return
     */
    private static String reverseString(String s, int start, int end){
        //将字符串转换为数组
        char[] c = s.toCharArray();
        //将数组反转
        char[] rc = reverse(c, start, end);
        //将数组转换为字符串
        return new String(rc);
    }

    /**
     * 字符串反转
     * @param s
     * @return
     */
    private static String reverseString(String s){
        //将字符串转换为数组
        char[] c = s.toCharArray();
        //将数组反转
        char[] rc = reverse(c, 0, s.length());
        //将数组转换为字符串
        return new String(rc);
    }
    private static char[] reverse(char[] c, int x, int y){
        //Java编码规则，一般是包含头不包含尾的
        for(int start=x,end=y-1; start<=end; start++,end--){
            swap(c, start, end);
        }
        return c;
    }
    private static char[] swap(char[] c, int start, int end){
        char temp = c[start];
        c[start] = c[end];
        c[end] = temp;
        return c;
    }
}
