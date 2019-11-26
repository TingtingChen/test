package com.java.test.util.day15;

/**
 * Created by chentingting on 2019/11/15.
 */
public class GenericDemo09 {
    public static void main(String[] args){
        Demo d = new Demo();
        d.show("abc");
        d.show(3);
    }

}
class Demo{
    public <T> void show(T t){
        System.out.println(t);
    }
    public <Q> void print(Q q){
        System.out.println(q);
    }
}
