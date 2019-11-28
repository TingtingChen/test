package com.java.test.util.day18;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chentingting07 on 2019/11/24.
 */
public class FileWriterIOExc08 {
    public static void main(String[] args){
        FileWriter fw = null;
        try{
            fw = new FileWriter("demo.txt");
            fw.write("abc");
        }catch (IOException e){
            System.out.println(e.toString());
        }finally {
            try{
                if(fw!=null)
                    fw.close();
            }catch (IOException e){
                System.out.println(e.toString());
            }
        }
    }
}
