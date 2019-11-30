package com.java.test.util.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by chentingting07 on 2019/11/30.
 */
public class TransStreamDemo16 {
    public static void main(String[] args) throws IOException{
        //获取键盘录入对象
        InputStream is = System.in;
        //将字节流对象转成字符流对象，使用转换流。InputStreamReader
        InputStreamReader isr = new InputStreamReader(is);
        //为了提高效率，将字符串进行缓冲区技术高效操作。使用BufferedReader
        BufferedReader br = new BufferedReader(isr);
        String s = null;
        while ((s = br.readLine())!= null){
            if("over".equals(s))
                break;
            System.out.println(s.toUpperCase());
        }
        br.close();
    }
}
