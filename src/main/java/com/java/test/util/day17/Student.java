package com.java.test.util.day17;

/**
 * Created by chentingting on 2019/11/18.
 */
public class Student implements Comparable<Student>{
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
        String s = this.getName() + ":" + this.age;
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
//        System.out.println(this.name + ":" + s.getName() + ", " + this.age + ":" + s.getAge());
        int num = this.name.compareTo(s.getName());
        if(num == 0)
            return ((Integer)this.age).compareTo((Integer)s.getAge());
        return num;
    }
}
