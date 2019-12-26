package com.java.test.util.day23;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class TcpServer11{
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(10001);
        Socket s = ss.accept();
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + "......connected");
        InputStream is = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        System.out.println(new String(buf,0,len));
        s.close();
        ss.close();//服务端可以不关闭

    }
}
