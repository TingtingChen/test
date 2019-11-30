package com.java.test.util.day19;

import java.io.*;

/**
 * Created by chentingting07 on 2019/11/30.
 */
public class IOTest19 {
    public static void main(String[] args){
        FileReader fr = null;
        try{
            fr = new FileReader("/Users/chentingting07/IdeaProjects/xm-qa/Test/src/main/java/com/java/test/util/day19/InputStreamDemo11.java");
            BufferedReader bufr = new BufferedReader(fr);
            BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
            String s = null;
            while ((s = bufr.readLine()) != null){
                bufw.write(s);
                bufw.newLine();
                bufw.flush();
            }
        }catch (IOException e){
            throw new RuntimeException("打印失败");
        }finally {
            try{
                if(fr != null)
                    fr.close();
            }catch (IOException e){
                throw new RuntimeException("关闭输入流失败");
            }
        }
    }
}
