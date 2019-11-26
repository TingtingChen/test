package com.java.test.util.day17;

/**
 * Created by chentingting on 2019/11/22.
 */
public class ParamMethodDemo19 {
    public static void main(String[] arg){
        show(1,2,3,4);
        show2("abc", 1,2,3,4);
    }
    public static void show(int... arr){
        System.out.println(arr.length);
    }
    public static void show2(String s, int... arr){
        System.out.println(arr.length);
    }
}
