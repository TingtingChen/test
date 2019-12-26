package com.java.test.util.day23;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DataSendDemo07 {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        byte[] buf = "udp Test".getBytes();
        ds.send(new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.2.102"), 1000));
        ds.close();
    }
}
