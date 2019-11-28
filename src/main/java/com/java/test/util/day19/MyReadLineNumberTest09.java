package com.java.test.util.day19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by chentingting07 on 2019/11/28.
 */
public class MyReadLineNumberTest09 {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("/Users/chentingting07/IdeaProjects/xm-qa/Test/src/main/java/com/java/test/util/day19/BufferedReaderTest05.java");
        MyReadLineNumber mrln = new MyReadLineNumber(fr);
        String buf = null;
        mrln.setLineNumber(100);
        while ((buf = mrln.myReadLine())!= null){
            System.out.println(mrln.getLineNumber() + ":" + buf);
        }
        mrln.close();
    }

}

class MyReadLineNumber extends BufferedReader{
    private int offset = 0;
    public MyReadLineNumber(Reader in){
        super(in);
    }
    public MyReadLineNumber(Reader in, int sz) {
        super(in, sz);
    }
    public String myReadLine() throws IOException {
        offset++;
        return super.readLine();
    }
    public void setLineNumber(int line){
        this.offset = line;
    }
    public int getLineNumber(){
       return offset;
    }
}
