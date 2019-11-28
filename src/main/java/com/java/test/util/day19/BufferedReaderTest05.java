package com.java.test.util.day19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by chentingting07 on 2019/11/26.
 */
public class BufferedReaderTest05 {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("/Users/chentingting07/IdeaProjects/xm-qa/Test/src/main/java/com/java/test/util/day19/BufferedReaderTest05.java");
        MyBufferedReader mbf = new MyBufferedReader(fr);
        String s = null;
        while ((s=mbf.myReadLine())!= null){
            System.out.println(s);
        }
        mbf.close();
    }
}

class MyBufferedReader extends Reader{
    private FileReader reader ;
    MyBufferedReader(FileReader r){
        this.reader = r;
    }
    public String myReadLine() throws IOException{
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while ((i = reader.read())!=-1){
            if((char)i == '\r')
                continue;
            if((char)i == '\n')
                return sb.toString();
            else
                sb.append((char)i);
        }
        if (sb.length()!=0){
            return sb.toString();
        }
        return null;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return reader.read(cbuf, off, len);
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }
}
