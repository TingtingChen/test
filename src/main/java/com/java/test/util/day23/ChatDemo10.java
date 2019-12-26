package com.java.test.util.day23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ChatDemo10 {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        DatagramSocket dsRs = new DatagramSocket(1001);
        new Thread(new Send(ds)).start();
        new Thread(new Rese(dsRs)).start();
    }
}

class Send implements Runnable{
    private DatagramSocket ds;
    public Send(DatagramSocket ds){
        this.ds = ds;
    }
    public void run(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DatagramPacket dp;
        String line = null;
        try{
            while ((line = br.readLine())!= null){
                dp = new DatagramPacket(line.getBytes(),line.getBytes().length, InetAddress.getByName("192.168.2.255"), 1001);
                if ("over".equals(line))
                    break;
                ds.send(dp);
            }
        }catch (Exception e){
            throw new RuntimeException("发送失败");
        }finally {
            ds.close();
        }

    }
}
class Rese implements Runnable{
    private DatagramSocket ds;
    public Rese(DatagramSocket ds){
        this.ds = ds;
    }
    public void run(){
        DatagramPacket dp;
        try{
            while (true){
                byte[] bufs = new byte[1024];
                dp = new DatagramPacket(bufs, bufs.length);
                ds.receive(dp);
                String ip = dp.getAddress().getHostAddress();
                String data  = new String(dp.getData(),0, dp.getLength());
                System.out.println(ip + "::" + data);
            }
        }catch (Exception e){
             throw new RuntimeException("接受失败");
        }finally {
            ds.close();
        }
    }
}