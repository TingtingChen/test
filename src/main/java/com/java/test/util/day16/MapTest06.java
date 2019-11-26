package com.java.test.util.day16;

import java.util.*;

/**
 * Created by chentingting on 2019/11/17.
 */
public class MapTest06 {
    public static void main(String[] args){
        Map<Student,String> map = new HashMap<Student,String>();
        map.put(new Student("zhangsan01",19),"北京");
        map.put(new Student("zhangsan02",20),"上海");
        map.put(new Student("zhangsan03",19),"合肥");
        map.put(new Student("zhangsan01",19),"厦门");

        Set<Student> keySet = map.keySet();
        Iterator<Student> it = keySet.iterator();
        System.out.println("keySet取法：");
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s + ", address:" + map.get(s));
        }

        Set<Map.Entry<Student, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Student, String>> itEn = entrySet.iterator();
        System.out.println("entrySet取法：");
        while (itEn.hasNext()){
            Map.Entry<Student, String> me = itEn.next();
            System.out.println(me.getKey() + ", address:" + me.getValue());
        }

    }



}
class Student implements Comparable<Student>{
    private String name;
    private int age;
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public String toString(){
        String s = "name:" + this.getName() + ", age:" + this.age;
        return s;
    }

    public boolean equals(Object obj){
        if (!(obj instanceof Student)){
            throw new ClassCastException("不是Student类型对象");
        }
        Student s = (Student)obj;
        return this.name.equals(s.getName()) && this.age == s.getAge();
    }
    public int hashCode(){
        return name.hashCode()+age*27;
    }
    public int compareTo(Student s){
        int num = this.name.compareTo(s.getName());
        if(num == 0)
            return ((Integer)this.age).compareTo((Integer)s.getAge());
        return num;
    }
}

