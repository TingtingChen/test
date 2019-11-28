package com.java.test.util.day18;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by chentingting07 on 2019/11/24.
 */
public class FileRreaderTest12 {
    public static void main(String[] args){
        FileReader fr = null;
        try {
            fr = new FileReader("/Users/chentingting07/IdeaProjects/xm-qa/Test/src/main/java/com/java/test/util/day18/FileReaderDemo11.java");
            char[] buf = new char[1024];
            int num;
            while ((num = fr.read(buf))!= -1){
                System.out.print(new String(buf, 0 ,num));
            }
        }catch (IOException e){
            System.out.println(e.toString());
        }
        finally {
            try{
                if(fr != null)
                    fr.close();
            }catch (IOException e) {
                System.out.println(e.toString());

            }
        }
    }
}
