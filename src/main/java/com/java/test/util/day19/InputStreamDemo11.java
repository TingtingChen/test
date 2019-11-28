package com.java.test.util.day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by chentingting07 on 2019/11/28.
 */
public class InputStreamDemo11 {
    public static void main(String[] args) throws IOException{
        fileInputStreamDemo2();

    }

    public static void fileInputStreamDemo() throws IOException{
        FileInputStream fis = new FileInputStream("/Users/chentingting07/IdeaProjects/xm-qa/Test/src/main/java/com/java/test/util/day19/BufferedReaderTest05.java");
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf))!=-1){
            System.out.print(new String(buf, 0, len));
        }
    }

    public static void fileInputStreamDemo2() throws IOException{
        FileInputStream fis = new FileInputStream("/Users/chentingting07/IdeaProjects/xm-qa/Test/src/main/java/com/java/test/util/day19/BufferedReaderTest05.java");
        byte[] buf = new byte[fis.available()];    //定义一个刚刚好的缓冲区，就不用再选好了，但是要注意，虚拟机的内存默认是64M,如果文件太大（多媒体文件）还是需要用上一种方式
        fis.read(buf);
        System.out.println(new String(buf));

    }

    public static void fileOutputStreamDemo() throws IOException{
        FileOutputStream fos = new FileOutputStream("demo.txt");
        fos.write("abc".getBytes());
        fos.close();
    }
}
