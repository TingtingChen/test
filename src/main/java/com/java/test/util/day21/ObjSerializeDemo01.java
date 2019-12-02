package com.java.test.util.day21;

import java.io.*;

/**
 * Created by chentingting07 on 2019/12/2.
 */
public class ObjSerializeDemo01 {
    public static void main(String[] arg) throws Exception {
//        writeObj();
        readObj();
    }
    private static void readObj() throws Exception{
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("Person.object"));
        Person p = (Person)ois.readObject();
        System.out.println(p.toString());
    }
    private static void writeObj() throws IOException{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Person.object"));
        Person p = new Person();
        p.setName("zhangsan");
        p.setAge(34);
        os.writeObject(p);
        os.close();
    }
}
