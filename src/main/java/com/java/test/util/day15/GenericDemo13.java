package com.java.test.util.day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by chentingting on 2019/11/15.
 */
public class GenericDemo13 {
    public static void main(String[] args){
        TreeSet<Student3> ts = new TreeSet<Student3>(new Com());
        ts.add(new Student3("asdj01"));
        ts.add(new Student3("skfj20"));
        ts.add(new Student3("asdj012"));
        Iterator<Student3> it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }

    }
}

class Com implements Comparator<Person>{
    public int compare(Person p1,Person p2){
        return p1.getName().compareTo(p2.getName());
    }
}

class Person{
    private String name;
    Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "persion:"+name;
    }
}

class Student3 extends Person{
    public Student3(String name) {
        super(name);
    }
}
class Worker2 extends Person{
    public Worker2(String name) {
        super(name);
    }
}

