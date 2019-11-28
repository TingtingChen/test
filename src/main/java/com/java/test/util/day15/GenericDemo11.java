package com.java.test.util.day15;

/**
 * Created by chentingting on 2019/11/15.
 */
public class GenericDemo11 {
    public static void main(String[] args){
//        InterImpl i = new InterImpl();
//        i.show("ab");
        InterImpl2<String> i = new InterImpl2<String>();
        i.show("a");
    }
}

interface Inter<T>{
    public abstract void show(T t);
}

//class InterImpl implements Inter<String>
//{
//    public void show(String s){
//         System.out.println("show:"+s);
//    }
//}
class InterImpl2<T> implements Inter<T>{
    public void show(T t){
        System.out.println("show:"+ t );
    }
}
