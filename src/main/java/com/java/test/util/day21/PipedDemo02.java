package com.java.test.util.day21;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by chentingting07 on 2019/12/2.
 */
public class PipedDemo02 {
    public static void main(String[] args) throws IOException{
        PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream();
        in.connect(out);
        Read read = new Read(in);
        Write writer = new Write(out);
        Thread thread1 = new Thread(read);
        Thread thread2 = new Thread(writer);
        thread1.start();
        thread2.start();
    }

}
class Read implements Runnable{
    PipedInputStream in;
    Read(PipedInputStream in ){
        this.in = in;
    }
    public void run(){
        try{
            byte[] bytes = new byte[1024];
            int len = in.read(bytes);
            String s = new String(bytes, 0, len);
            System.out.println(s);

        }catch (IOException e){
            throw new RuntimeException("管道输出流异常");
        }finally {
            try{
                in.close();
            }catch (IOException e){
                throw new RuntimeException("管道输出流异常");
            }

        }
    }
}
class Write implements Runnable{
    PipedOutputStream out;
    Write(PipedOutputStream out){
        this.out=out;
    }
    public void run(){
        try{
            String s = "abc dsjkjl sdf";
            out.write(s.getBytes());
            out.flush();

        }catch (IOException e){
            throw new RuntimeException("管道输入流异常");
        }finally {
            try{
                out.close();
            }catch (IOException e){
                throw new RuntimeException("管道输入流异常");
            }

        }

    }

}
