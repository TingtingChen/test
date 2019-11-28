package com.java.test.util.day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by chentingting on 2019/11/16.
 */
public class GenericDemo12 {
    public static void main(String[] args){
        TreeSet<Student4> ts = new TreeSet<Student4>(new ComTs());
        ts.add(new Student4("abc01"));
        ts.add(new Student4("abc02"));
        ts.add(new Student4("abc03"));
        ts.add(new Student4("abc04"));
        printColl(ts);

        TreeSet<Person2> tsP = new TreeSet<Person2>(new ComTs());
        tsP.add(new Person2("abc01P"));
        tsP.add(new Person2("abc02P"));
        tsP.add(new Person2("abc03P"));
        tsP.add(new Person2("abc04P"));
        printColl(tsP);

    }
    public static void printColl(TreeSet<? extends Person2> ts){
        Iterator<? extends Person2> it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }
    }

}
class ComTs implements Comparator<Person2>{
    public int compare(Person2 s1,Person2 s2){
        return s1.getName().compareTo(s2.getName());
    }
}

class Person2{
    private String name;
    Person2(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Student4 extends Person2{
    Student4(String name){
        super(name);
    }
}
