package com.java.test.util.day21;

import java.io.*;

/**
 * Created by chentingting07 on 2019/12/3.
 */
public class DataStreamDemo04 {
    public static void main(String[] args) throws IOException{
//        writeData();
//        readData();
        writeUTF();
        readUTF();
    }
    public static void writeUTF() throws IOException{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("utf.txt"));
        dos.writeUTF("你好");
        dos.close();
    }
    public static void readUTF() throws IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("utf.txt"));
        String s = dis.readUTF();
        System.out.println(s);
        dis.close();
    }

    public static void readData() throws IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
        int i = dis.readInt();
        boolean b = dis.readBoolean();
        float f = dis.readFloat();
        System.out.println("i = " + i);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
        dis.close();
    }

    public static void writeData() throws IOException{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
        dos.writeInt(23);
        dos.writeBoolean(true);
        dos.writeFloat(2343.4323f);
        dos.close();
    }
}
