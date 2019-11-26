package com.java.test.util.day14;

import java.util.LinkedList;

/**
 * Created by chentingting on 2019/11/13.
 * 使用LinkedList模拟一个堆栈或队列数据结构。
 */
public class LinkedListTest09 {

    public static void main(String[] args){
        Duilie dl = new Duilie();
        dl.myAdd("java01");
        dl.myAdd("java02");
        dl.myAdd("java03");
        dl.myAdd("java04");
        System.out.println(dl.myGet());
        while (!dl.isNull()){
            System.out.println(dl.myGet());
        }

    }
}
class Duilie{
    private  LinkedList link;
    Duilie(){
        link = new LinkedList();
    }

    public void myAdd(Object obj){
        link.addFirst(obj);
    }
    public Object myGet(){
        return link.pollLast();
    }
    public boolean isNull(){
        return link.isEmpty();
    }
}
