package com.java.test.util.day23;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpRece2_09 {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(1001);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        while (true){
            ds.receive(dp);
            String ip = dp.getAddress().getHostAddress();
            String data = new String(dp.getData(),0, dp.getLength());
            System.out.println(ip + "::" + data);
        }
    }
}
