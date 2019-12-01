package com.java.test.util.day20;

import java.io.File;

/**
 * Created by chentingting07 on 2019/12/1.
 */
public class DiGuiDemo07 {
    public static void main(String[] args){
        File f = new File("/Users/chentingting07/Documents/java学习");
        printFile(f, 0);
    }
    public static String level(int level){
        StringBuilder sb = new StringBuilder();
        sb.append("|--");
        for(int x=0; x<level; x++){
            sb.insert(0,"  ");
        }
        return sb.toString();
    }

    public static void printFile(File dir, int level){
        System.out.println(level(level) + dir);
        level++;
        File[] files = dir.listFiles();
        for(File file : files){
            if(file.isDirectory())
                printFile(file, level);
            else
                System.out.println(level(level) + file);
        }
    }
}
