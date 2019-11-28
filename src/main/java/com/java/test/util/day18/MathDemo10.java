package com.java.test.util.day18;

/**
 * Created by chentingting07 on 2019/11/24.
 */
public class MathDemo10 {
    public static void main(String[] args){
//        double d1 = Math.ceil(12.3);
//        System.out.println("d1" + d1);
//        double d2 = Math.floor(12.3);
//        System.out.println("d2" + d2);
        double d3 = Math.round(12.3);
        System.out.println("d3:" + d3);
//        double d4 = Math.pow(2,4);
//        System.out.println("d4" +d4);
//        //随机数random
////        for(int x=0; x<10; x++){
////            double d5 = Math.random() *10+1;
////            System.out.println((int)d5);
////        }
//
//        //Random类
//        Random rd = new Random();
//        for(int x=0; x<10; x++){
//            int i = rd.nextInt(10) +1;
//            System.out.println(i);
//        }
        System.out.println(mathTest(12.33323f));

    }
    //练习：给定一个小数，保留该小数的后两位。
    public static float mathTest(float f){
        float f1 = (float)Math.round(f*100)/100;
        return f1;
    }
}
