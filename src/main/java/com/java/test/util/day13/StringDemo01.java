package com.java.test.util.day13;

/**
 * Created by chentingting on 2019/11/1.
 */
public class StringDemo01 {
    public static void main(String[] args){
        String s1 = "abc";     //s1是一个类类型变量，"abc"是一个对象，字符串最大特点：一旦被初始化就不可以被改变。
        String s2 = new String("abc");
        String s3 = "abc";

        /*
        s1和s2有何区别：
        s1在内存中有一个对象
        s2在内存中有两个对象
         */


        System.out.println(s1==s2);     //判断s1和s2的地址值是否相同
        System.out.println(s1==s3);       //结果是true。因为s3初始化的时候，发现常量"abc"已经在内存中存在，就不会再开辟空间了
        System.out.println(s1.equals(s2));    //String复写了Object类中的equals方法。该方法用于判断字符串是否相同
    }
}
