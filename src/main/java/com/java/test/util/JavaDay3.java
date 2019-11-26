package com.java.test.util;

/**
 * 循环的一些练习
 * Created by chentingting on 2019/8/17.
 */
public class JavaDay3 {


    public static void sum(){
        int sum = 0;
        for (int x = 1; x <= 10; x++){
            sum +=x;
        }
        System.out.println(sum);
    }

    public static void zhengChu(){
//        int x=1, y=0;
//        while (x <= 100){
//            if (x%7 == 0){
//                System.out.println(x);
//                y++;
//            }
//            x++;
//        }
        int y = 0;
        for (int x = 1; x <= 100; x++){
            if (x%7 == 0){
                System.out.println(x);
                y++;
            }
        }
        System.out.print("1~100间能被7整除的数有"+ y + "个。");
    }

    public static void forQianTao(){
        for (int x = 0; x < 5; x++){
            for (int y = 5; y > x; y--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int x = 0; x < 5; x++){
            for (int y = 0; y <= x; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void forQianTao2(){
        for (int x=1; x<6; x++){
            for (int y= 1; y<=x; y++){
                System.out.print(y);
            }
            System.out.println();
        }
    }

    public static void forJiuJiuChengFa(){
        w:for (int x=1; x<4; x++){
            q:for (int y= 1; y<=x; y++){
                System.out.print(y + "*" + x + "=" + x*y + " ");
                continue w;
            }
            System.out.println();

        }
    }

    public static void dengYao(){

       for (int x=0; x<5; x++){
           for (int y=4; y>x; y--){
               System.out.print(" ");
           }
           for (int z=0; z<=x; z++){
               System.out.print("*");
               System.out.print(" ");
           }
          System.out.println();
       }
    }

}
