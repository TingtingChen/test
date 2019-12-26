package com.java.test.util.day23;

import java.io.OutputStream;
import java.net.Socket;

public class TcpClient11{
public static void main(String[] args) throws Exception{
        Socket s = new Socket("192.168.2.102", 10001);
        OutputStream os = s.getOutputStream();
        os.write("tcp test".getBytes());
        s.close();
        }
}