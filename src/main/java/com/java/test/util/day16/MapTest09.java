package com.java.test.util.day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by chentingting on 2019/11/18.
 */
public class MapTest09 {
    public static void main(String[] args){
        HashMap<String, HashMap<String, String>> czbk = new HashMap<String, HashMap<String, String>>();
        HashMap<String,String> yure = new HashMap<String,String>();
        HashMap<String,String> jiuye = new HashMap<String,String>();
        czbk.put("yure",yure);
        czbk.put("jiuye", jiuye);

        yure.put("01","zhangsan");
        yure.put("02","lisi");

        jiuye.put("01","zhaoliu");
        jiuye.put("02","wangwu");

        Set<String> set = czbk.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String banji = it.next();
            HashMap<String, String> hm = czbk.get(banji);
            System.out.println(banji);
            printStudent(hm);
        }
        listDemo();

    }
    public static void printStudent(HashMap<String,String> hm){
        Set<String> keySet =  hm.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()){
            String id = it.next();
            String name = hm.get(id);
            System.out.println(id + "::" +name);
        }
    }
    //另一种存储方式
    public static void listDemo(){
        HashMap<String, ArrayList<Student2>> czbk = new HashMap<String, ArrayList<Student2>>();
        ArrayList<Student2> yure= new ArrayList<Student2>();
        ArrayList<Student2> jiuye= new ArrayList<Student2>();

        yure.add(new Student2("01","zhangsan"));
        yure.add(new Student2("02","lisi"));
        jiuye.add(new Student2("01","wangwu"));
        jiuye.add(new Student2("02","zhaoliu"));

        czbk.put("yure",yure);
        czbk.put("jiuye", jiuye);

        Set<String> set = czbk.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String banji = it.next();
            ArrayList<Student2> s = czbk.get(banji);
            System.out.println(banji +", " + s);
        }




    }

}

class Student2{
    private String id;
    private String name;
    Student2(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return id +"::" +name;
    }
}