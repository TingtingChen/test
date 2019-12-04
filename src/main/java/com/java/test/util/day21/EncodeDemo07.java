package com.java.test.util.day21;

import java.io.UnsupportedEncodingException;

/**
 * Created by chentingting07 on 2019/12/4.
 */
public class EncodeDemo07 {
    public static void main(String[] args) throws UnsupportedEncodingException{
        String s = "你好";
        byte[] bytes = s.getBytes("GBK");
        System.out.println(bytes.toString());
        String s1 = new String(bytes, "iso8859-1");
        System.out.println(s1);
        //如果解码错了，可以重新编解码就能获得原来的字符串了。（但仅限错误解码为iso8859-1）
        byte[] bytes1 = s1.getBytes("iso8859-1");
        String s2 = new String(bytes1, "GBk");
        System.out.println(s2);

    }
}
