package com.java.test.util.day18;

import java.util.Properties;

/**
 * Created by chentingting on 2019/11/22.
 */
public class PropertyDemo01 {
    public static void main(String[] args){
        Properties properties = System.getProperties();
//        因为Properties是Hashtable的子类，也就是Map集合的一个子类对象。
//        那么可以通过map的方法去除该集合中的元素。
//        该集合中存储的都是字符串。没有泛型定义。


        //在系统中自定义特有信息
        System.setProperty("myKey", "myValue");
        //获取所有属性信息
//        for (Object obj : properties.keySet()){
//            String s = (String)obj;
//            System.out.println(s + "::" + properties.get(s));
//        }
//
        //获取指定属性信息
        String osname = System.getProperty("os.name");
        System.out.println(osname);

        //在jvm启动的时候动态加载属性信息:java -Dhaha=qqqq PropertyDemo01
        String v = System.getProperty("haha");
        System.out.println("v=" + v);

    }
}
