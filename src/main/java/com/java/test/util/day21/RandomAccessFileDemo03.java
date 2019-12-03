package com.java.test.util.day21;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by chentingting07 on 2019/12/3.
 */
public class RandomAccessFileDemo03 {
    public static void main(String[] args) throws IOException{
        writeFile();
        readFile();
    }
    public static void readFile() throws IOException{
        RandomAccessFile raf = new RandomAccessFile("randomAccessFile.txt", "r");
        byte[] buf = new byte[4];
        raf.seek(8);
        raf.read(buf);
        String name = new String(buf,"GBK");
        System.out.println("name=" + name);
        int age = raf.readInt();
        System.out.println("age=" + age);
        raf.close();
    }
    public static void writeFile() throws IOException{
        RandomAccessFile raf = new RandomAccessFile("randomAccessFile.txt", "rw");
        raf.write("张三".getBytes("GBK"));
        raf.writeInt(20);
        raf.write("李四".getBytes("GBK"));
        raf.writeInt(30);
        raf.close();
    }
}
