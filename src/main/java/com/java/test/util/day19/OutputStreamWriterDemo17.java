package com.java.test.util.day19;

import java.io.*;

/**
 * Created by chentingting07 on 2019/11/30.
 */
public class OutputStreamWriterDemo17 {
    public static void main(String[] args) throws IOException{
        //键盘录入的最常见写法。
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = null;
        while ((s = br.readLine())!= null){
            if("over".equals(s))
                break;
            bw.write(s.toUpperCase());
            bw.newLine();
            bw.flush();
        }
        br.close();
    }
}
