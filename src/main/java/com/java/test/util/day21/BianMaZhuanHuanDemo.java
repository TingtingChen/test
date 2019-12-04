package com.java.test.util.day21;

import java.io.*;

/**
 * Created by chentingting07 on 2019/12/4.
 */
public class BianMaZhuanHuanDemo {
    public static void main(String[] args) throws IOException{
        writeFile();
        readFile();
    }
    public static void readFile() throws IOException{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("utf.txt"), "utf-8");
        char[] ch = new char[10];
        isr.read(ch);
        System.out.println(ch);
        isr.close();
    }

    public static void writeFile() throws IOException{
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf.txt"), "utf-8");
        osw.write("你好");
        osw.close();
    }
}
