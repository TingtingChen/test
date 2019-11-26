package com.java.test.util.day13;

/**
 * Created by chentingting on 2019/11/6.
 */
public class StringDemo02 {

    public static void main(String[] args){
        String  s1= "sdkfjlkjdal";
//        method_get(s1);
//        method_is(s1);
        method_trans();
    }
    private static void method_get(String s){
        sop(s.length());
        sop(s.charAt(3));
        sop(s.indexOf(s));
//        sop(s.indexOf(20)); //    当访问到字符串中不存在的角标时，会发送StringIndexOutOfBoundsException
        sop(s.indexOf("dkj")); //   如果没有找到。返回-1
    }
    private static void method_is(String s){
        sop(s.startsWith("s"));
        sop(s.endsWith("l"));
        sop(s.contains("fj"));
    }
    private static void method_trans(){
        char[] c = {'f','2','3','d','w','s'};
        sop(new String(c));
        String s = "sdjk3ijr";
        char[] c2 = s.toCharArray();
        for (int i = 0; i<c2.length; i++){
            sop(c2[i]);
        }

    }
    public static void sop(Object obj){
        System.out.println(obj);
    }
}



