package com.java.test.util.day18;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by chentingting07 on 2019/11/24.
 */
public class FileReaderDemo11 {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("demo.txt");
        //定义一个字符数组。用于存储读到字符。
        //该read(char[])返回的是读到字符个数。
        char[] ch = new char[1024];
        int num = 0;
        while ((num = fr.read(ch))!=-1){
            System.out.print(String.copyValueOf(ch,0,num));
        }
        fr.close();
    }
}
