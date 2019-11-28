package com.java.test.util.day14;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by chentingting on 2019/11/14.
 */
public class ArrayListTest11 {

    public static void main(String[] ages){
        ArrayList al = new ArrayList();
        al.add(new Person("lisi01", 30));
        al.add(new Person("lisi02", 31));
        al.add(new Person("lisi02", 31));
        al.add(new Person("lisi04", 33));
        al.add(new Person("lisi01", 30));
        Iterator it = al.iterator();
        sop("去重前：");
        while (it.hasNext()){
            Object obj = it.next();
            Person p = (Person)obj;
            sop(p.getName() + "...." + p.getAge());
        }
        sop("去重后：");
        ArrayList nal = disList(al);
        Iterator nit = nal.iterator();
        while (nit.hasNext()){
            Object obj = nit.next();
            Person p = (Person)obj;
            sop(p.getName() + "...." + p.getAge());
        }

    }

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
class Person{
    private String name;
    private int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Person))
            return false;
        Person p = (Person)obj;
        System.out.println(p.getName()+"..equals.."+ p.getAge());
        return this.name.equals(p.getName()) && this.age == p.getAge();
    }
    public int hashCode(){
        System.out.println(this.name+"...hashCode");
        return name.hashCode() + age*27;
    }
}
