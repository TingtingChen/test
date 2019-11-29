package com.java.test.util.day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by chentingting07 on 2019/11/29.
 */
public class CopyPictureDemo12 {
    public static void main(String[] args){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream("mypicture.jpeg");
            fos = new FileOutputStream("copypicture.jpeg");
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = fis.read(buf))!= -1){
                fos.write(buf);
            }
        }catch (IOException e){
            throw new RuntimeException("图片拷贝失败");
        }finally {
            if(fis != null){
                try{
                    fis.close();
                }catch (IOException e){
                    throw new RuntimeException("图片拷贝失败");
                }
            }
            if(fos != null){
                try{
                    fos.close();
                } catch (IOException e){
                    throw new RuntimeException("图片拷贝失败");
                }
            }
        }
    }
}
