package com.java.test.util.day19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chentingting07 on 2019/11/25.
 */
public class BufferedWriterDemo01 {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("demo.txt");
        BufferedWriter bufw = new BufferedWriter(fw);
        for (int x=0 ; x<10 ;x++){
            bufw.write("abc");
            bufw.newLine();
            //只要用到缓冲区，就要记得刷新
            bufw.flush();
        }
        //其实关闭缓冲区就是在关闭缓冲区中的流对象。
        bufw.close();

    }
}
