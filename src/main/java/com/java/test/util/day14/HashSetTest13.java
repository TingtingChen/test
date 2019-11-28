package com.java.test.util.day14;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by chentingting on 2019/11/14.
 */
public class HashSetTest13 {
    public static void main(String[] args){
        HashSet hs = new HashSet();
        hs.add(new Person("lisi01", 30));
        hs.add(new Person("lisi02", 32));
        hs.add(new Person("lisi03", 33));
        hs.add(new Person("lisi04", 34));
        hs.add(new Person("lisi01", 30));
        Iterator it = hs.iterator();
        while (it.hasNext()){
            Person p = (Person)it.next();
            sop(p.getName() + "::" + p.getAge());
        }
    }
    public static void sop(Object obj){
        System.out.println(obj);
    }

}
//存疑，如果在同一个包下定义名称不同的类，但都重写了hashCode、equals方法，会导致equals方法不会被跑到
//class Person2{
//    private String name;
//    private int age;
//    Person2(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//    public String getName(){
//        return name;
//    }
//    public int getAge(){
//        return age;
//    }
//    public boolean equals(Object obj){
//        if(!(obj instanceof Person))
//            return false;
//        Person p = (Person)obj;
//        System.out.println(p.getName()+"..equals.."+ p.getAge());
//        return this.name.equals(p.getName()) && this.age == p.getAge();
//    }
//    public int hashCode(){
////        System.out.println(this.name+"...hashCode");
//        return name.hashCode() + age*27;
//    }
//}