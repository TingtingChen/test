package com.java.test.util.day15;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by chentingting on 2019/11/14.
 */
public class TreeSet02 {
    public static void main(String[] args){
        TreeSet ts = new TreeSet();
        ts.add(new Student("abc",20));
        ts.add(new Student("ere",23));
        ts.add(new Student("sed",25));
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
class Student implements Comparable{
    private String name;
    private int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int compareTo(Object obj){
        if(!(obj instanceof Student))
            throw new RuntimeException("不是student对象");
        Student s = (Student)obj;
        if(this.age>s.age)
            return 1;
        if(this.age==s.age){
            return this.name.compareTo(s.name);
        }
        return -1;
    }
}
