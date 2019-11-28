package com.java.test.util.day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by chentingting on 2019/11/15.
 */
public class TreeSetDemo04 {
    public static void main(String[] args){
        TreeSet ts = new TreeSet(new MyCompare());
        ts.add(new Student("abc",20));
        ts.add(new Student("ere",23));
        ts.add(new Student("sed",25));
        ts.add(new Student("sed",24));
        ts.add(new Student("dfs",19));
        ts.add(new Student("ers",19));
        Iterator it = ts.iterator();
        while (it.hasNext()){
            Student s = (Student)it.next();
            sop(s.getName() + "..." + s.getAge());
        }

    }
    public static void sop(Object obj){
        System.out.println(obj);
    }
}

class MyCompare implements Comparator {
    public int compare(Object o1, Object o2){
        if (!(o1 instanceof Student) || !(o2 instanceof Student)){
            throw new RuntimeException("不是Student对象");
        }
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        if(s1.getName().compareTo(s2.getName())==0){
            return ((Integer)s1.getAge()).compareTo((Integer)s2.getAge());
        }
        return s1.getName().compareTo(s2.getName());
    }
}
