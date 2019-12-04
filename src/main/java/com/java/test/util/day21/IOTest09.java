package com.java.test.util.day21;

import java.io.BufferedInputStream;
import java.io.IOException;

/**
 * Created by chentingting07 on 2019/12/4.
 */
public class IOTest09 {
    public static void keyBoardInput() throws IOException{
        BufferedInputStream bis = new BufferedInputStream(System.in);
        StringBuilder sb = new StringBuilder();
        int ch = 0;
        while (true){
            if(bis.read()=='\r')
                continue;
            if (bis.read()=='\n')

                break;
            else
                sb.append(ch);
        }
        String[] buf = sb.toString().split("，");
    }
}
