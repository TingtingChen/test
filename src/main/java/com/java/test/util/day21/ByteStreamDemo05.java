package com.java.test.util.day21;


import java.io.*;
/**
 * Created by chentingting07 on 2019/12/4.
 */
public class ByteStreamDemo05 {
    public static void main(String[] args){
        ByteArrayInputStream bis = new ByteArrayInputStream("abcd".getBytes());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int ch = 0;
        while ((ch = bis.read())!=-1){
            bos.write(ch);
        }
        System.out.println(bos.toString());
//        bos.writeTo(new FileOutputStream("a.txt"));
    }
}
