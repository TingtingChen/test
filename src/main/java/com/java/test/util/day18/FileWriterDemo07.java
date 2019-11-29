package com.java.test.util.day18;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chentingting07 on 2019/11/24.
 */
public class FileWriterDemo07 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("demo.txt");
        fw.write("abc");
        fw.flush();
        fw.close();
    }
}
