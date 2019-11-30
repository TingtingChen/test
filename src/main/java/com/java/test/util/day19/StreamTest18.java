package com.java.test.util.day19;

import java.io.*;

/**
 * Created by chentingting07 on 2019/11/30.
 */
public class StreamTest18 {
    public static void main(String[] args){
        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            is = new FileInputStream("mypicture.jpeg");
            os = new FileOutputStream("picture2.jpeg");
            BufferedInputStream bis= new BufferedInputStream(is);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            int ch = 0;
            while ((ch = bis.read())!=-1){
                bos.write(ch);
            }
        }catch (IOException e){
            throw new RuntimeException("文件复制失败");
        }finally {
            try{
                if(is!=null){
                    is.close();
                }
            }catch (IOException e) {
                throw new RuntimeException("关闭读取流失败");
            }
            try{
                if(os!=null){
                    os.close();
                }
            }catch (IOException e) {
                throw new RuntimeException("关闭写入流失败");
            }
        }
    }
}
