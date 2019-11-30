package com.java.test.util.day19;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by chentingting07 on 2019/11/30.
 */
public class ReadInDemo15 {
    public static void main(String[] args) throws IOException{
        InputStream is = System.in;
        StringBuilder sb = new StringBuilder();
        while (true){
            int ch = is.read();
            if(ch == '\r')
                continue;
            if(ch == '\n'){
                String s = sb.toString();
                if("over".equals(s))
                    break;
                System.out.println(s.toUpperCase());
                sb.delete(0, sb.length());
            }
            else
                sb.append((char)ch);
        }
    }
}
