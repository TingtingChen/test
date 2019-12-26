package com.java.test.util.day23;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DataReceDemo08 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(1000);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        ds.receive(dp);  //阻塞式方法，如果没有数据，会等待

        String ip = dp.getAddress().getHostAddress();
        String data = new String(dp.getData(),0, dp.getLength());
        int port = dp.getPort();
        System.out.println(ip + "::" + data + "::" + port);
        ds.close();
    }
}
