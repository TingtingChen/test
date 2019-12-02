package com.java.test.util.day21;

import java.io.Serializable;

/**
 * Created by chentingting07 on 2019/12/2.
 */
public class Person implements Serializable{

//    static final long serialVersionUID = 42L;//如果想要让类修改后还能使用，可以指定序列化id
    String name ;
    transient int age;     //加上transient参数，该参数就不参与序列化
    static String contury = "cn"; //静态变量不可序列化，因为静态变量不在堆内存中
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return name + ":" + age + ":" + contury;
    }
}
