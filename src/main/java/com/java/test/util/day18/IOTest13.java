package com.java.test.util.day18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chentingting07 on 2019/11/24.
 */
public class IOTest13 {
    public static void main(String[] args){
        FileWriter fw = null;
        FileReader fr = null;
        try{
            fr = new FileReader("/Users/chentingting07/IdeaProjects/xm-qa/Test/src/main/java/com/java/test/util/day18/FileWriterXuxie09.java");
            fw = new FileWriter("test.txt");
            char[] buf = new char[1024];
            int num = 0;
            while ((num = fr.read(buf)) != -1){
                fw.write(buf, 0 ,num);
            }
            fw.flush();
        } catch (IOException e){
            throw new RuntimeException("读写失败");
        }finally {
            if(fr != null)
            try{
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException("读写失败");
            }
            if(fw != null)
                try {
                    fw.close();
                }catch (IOException e) {
                    throw new RuntimeException("读写失败");
                }
        }
    }
}
