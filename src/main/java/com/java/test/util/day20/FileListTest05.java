package com.java.test.util.day20;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by chentingting07 on 2019/12/1.
 */
public class FileListTest05 {
    public static void main(String[] args) {
        File f = new File("/Users/chentingting07/IdeaProjects/xm-qa/Test/src/main/java/com/java/test/util/day19");
        String[] listFilter = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });
        for(String s : listFilter){
            System.out.println(s);
        }

    }

}
