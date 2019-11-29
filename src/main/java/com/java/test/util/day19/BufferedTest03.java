package com.java.test.util.day19;

import java.io.*;

/**
 * Created by chentingting07 on 2019/11/25.
 */
public class BufferedTest03 {
    public static void main(String[] args){
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader bufr = null;
        BufferedWriter bufw = null;
        try {
            fr = new FileReader("/Users/chentingting07/IdeaProjects/xm-qa/Test/src/main/java/com/java/test/util/day19/BufferedWriterDemo01.java");
            fw = new FileWriter("test2.txt");
            bufr = new BufferedReader(fr);
            bufw = new BufferedWriter(fw);
            String buf = null;
            while ((buf = bufr.readLine())!= null){
                bufw.write(buf);
                bufw.newLine();
                bufw.flush();
            }
        }catch (IOException e){
            throw new RuntimeException("复制失败");
        }finally {
            if(bufr!=null)
                try{
                    bufr.close();
                }catch (IOException e) {
                    throw new RuntimeException("关闭读文件流异常");
                }
            if(bufw!=null)
                try{
                    bufw.close();
                }catch (IOException e) {
                    throw new RuntimeException("关闭写文件流异常");
                }
        }

    }
}
