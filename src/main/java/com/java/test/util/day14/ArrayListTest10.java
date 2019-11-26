package com.java.test.util.day14;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by chentingting on 2019/11/14.
 */
public class ArrayListTest10 {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java01");
        al.add("java02");
        al.add("java02");
        al.add("java03");
        sop(disList(al));
    }

    /**
     * 对ArrayList去重
     * @param al
     * @return
     */
    public static ArrayList disList(ArrayList al){
        ArrayList newAl = new ArrayList();
        for(Iterator it = al.iterator(); it.hasNext();){
            Object obj = it.next();
            if(!newAl.contains(obj))
                newAl.add(obj);
        }
        return newAl;
    }
    public static void sop(Object obj){
        System.out.println(obj);
    }
}
