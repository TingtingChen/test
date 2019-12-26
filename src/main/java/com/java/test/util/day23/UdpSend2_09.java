package com.java.test.util.day23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSend2_09 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        DatagramPacket dp = null;
        DatagramSocket ds = new DatagramSocket();
        while ((line = bufr.readLine())!= null){
            if("over".equals(line))
                break;
            dp = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("localhost"), 1001);
            ds.send(dp);
        }
    }
}
