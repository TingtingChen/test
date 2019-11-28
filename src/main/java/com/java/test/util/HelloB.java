package com.java.test.util;

/**
 * Created by chentingting on 2019/11/21.
 */
class HelloA {
    public HelloA() {
        System.out.println("HelloA");
    }

    {
        System.out.println("I'm A class");
    }
    static
    {
        System.out.println("static A");
    }

}
public class HelloB extends HelloA {
    public HelloB()
    {
    System.out.println("HelloB");
    }

    {
        System.out.println("I'm B class");
    }
    static
    {
        System.out.println("static B");
    }
    public static void main(String[] args) {
        System.out.println("-----"+"main");
        new HelloB();
    }

}