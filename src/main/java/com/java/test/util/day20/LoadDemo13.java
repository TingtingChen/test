package com.java.test.util.day20;

import java.io.*;
import java.util.Properties;

/**
 * Created by chentingting07 on 2019/12/2.
 */
public class LoadDemo13 {
    public static void main(String[] args) throws IOException {
        loadDemo();
        loadYuanLi();
    }

    //load方法演示
    public static void loadDemo() throws IOException{
        FileInputStream fis = new FileInputStream("properties_test.txt");
        Properties pro = new Properties();
        pro.load(fis);
        //修改pro的属性之后，要保存到文件中。
        FileOutputStream fos = new FileOutputStream("properties_test.txt");
        pro.setProperty("wangwu", "23");
        pro.store(fos, "change wangwu age");
        //将属性列表输出到指定输出流
        pro.list(System.out);
    }

    //load方法原理
    public static void loadYuanLi() throws IOException{
        FileReader fr = new FileReader("properties_test.txt");
        BufferedReader bufr = new BufferedReader(fr);
        Properties pro = new Properties();
        String line = null;
        while ((line = bufr.readLine())!= null){
            if(line.contains("=")){
                String[] arr = line.split("=");
                pro.setProperty(arr[0], arr[1]);
            }
        }
        System.out.println(pro);
    }
}
