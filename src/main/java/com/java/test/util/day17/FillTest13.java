package com.java.test.util.day17;


import java.util.*;

/**
 * Created by chentingting on 2019/11/19.
 */
public class FillTest13 {
    public static void main(String[] args){
        List<String> l = new ArrayList<String>();
        l.add("bbb");
        l.add("aa");
        l.add("ccsd");
        l.add("asdfaa");
        l.add("hdga");
        myFill(l, "zzz", 1, 3);
        System.out.println(l);

        //Collections的replace方法
        Collections.replaceAll(l, "bbb", "11");
        System.out.println(l);

        //Collections自己的fill方法
        fillDemo(l, "abc");
        System.out.println(l);


    }
    //将集合中的部分元素替换成指定元素
    public static <T> void myFill(List<T> list, T rep, int start, int end){
        for( ;start<=end; start++){
            list.set(start, rep);
        }
    }

    public static <T> void fillDemo(List<T> list, T obj){
        Collections.fill(list, obj);
    }
}
