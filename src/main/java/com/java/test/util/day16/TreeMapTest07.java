package com.java.test.util.day16;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by chentingting on 2019/11/18.
 */
public class TreeMapTest07 {
    public static void main(String[] args){
        TreeMap<Student, String> tm = new TreeMap<Student, String>(new Com());
        tm.put(new Student("zhangsan01",19),"北京");
        tm.put(new Student("zhangsan02",20),"上海");
        tm.put(new Student("zhangsan03",19),"合肥");
        tm.put(new Student("zhangsan01",19),"厦门");
        Set<Student> keySet = tm.keySet();
        Iterator<Student> it = keySet.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println("key:" + s + ", address:" + tm.get(s));
        }
    }
}

class Com implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        int num = ((Integer)s1.getAge()).compareTo((Integer)s2.getAge());
        if(num == 0)
            return s1.getName().compareTo(s2.getName());
        return num;
    }
}