package com.java.test.util.day14;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by chentingting on 2019/11/13.
 */
public class ListIteratorTest05 {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java02");
        al.add("java03");

        ListIterator li = al.listIterator();

        while (li.hasNext()){
            Object obj = li.next();
            if(obj == "java02"){
                li.add("java007");
//                li.set("java009");
            }
        }
        sop(al);
        //反向迭代，判断前面是否有元素，有的话就循环
        while (li.hasPrevious()){
            sop("pre:" + li.previous());
        }

    }
    private static void sop(Object obj){
        System.out.println(obj);
    }
}
