package com.java.test.util.day18;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by chentingting07 on 2019/11/24.
 */
public class FileReaderDemo10 {
    public static void main(String[] args) throws IOException{
        //创建一个文件读取流对象，和指定名称的文件相关联。
        //要保证该文件是已经存在的，如果不存在，会发生FileNotFoundException
        FileReader reader = new FileReader("demo.txt");
        //调用读取流对象的read方法。
        //read():一次读一个字符，而且会自动往下读。
        int ch = 0;
        while ((ch = reader.read())!= -1){
            System.out.println("ch = " + (char)ch);
        }
    }
}
