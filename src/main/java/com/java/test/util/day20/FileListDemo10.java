package com.java.test.util.day20;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chentingting07 on 2019/12/1.
 */
public class FileListDemo10 {
    public static void main(String[] args){
        File file = new File("/Users/chentingting07/IdeaProjects/xm-qa/Test");
        List<File> list = new ArrayList<File>();
        fileToList(file, list);
        System.out.println(list.size());
        try{
            listToFile(list, new File(file, "javafilelist.txt"));
        }catch (IOException e){
            throw new RuntimeException("失败了" + e);
        }

    }
    public static void fileToList(File file, List<File> list){
        File[] files = file.listFiles();
        for(File file1 : files){
            if(file1.isDirectory())
                fileToList(file1, list);
            else {
                if(file1.getName().endsWith(".java"))
                    list.add(file1);
            }
        }
    }
    public static void listToFile(List<File> list, File file) throws IOException {
        BufferedWriter bufw = null;
        try{
            bufw = new BufferedWriter(new FileWriter(file));
            for(File file2 : list){
                bufw.write(file2.getAbsolutePath());
                bufw.newLine();
                bufw.flush();
            }
        }catch (IOException e){
            throw e;
        }finally {
            try{
                if(bufw!=null)
                    bufw.close();
            }catch (IOException e) {
                throw e;
            }
        }
    }
}
