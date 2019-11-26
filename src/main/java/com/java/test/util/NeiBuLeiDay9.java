package com.java.test.util;

/**
 * Created by chentingting on 2019/9/8.
 */
public class NeiBuLeiDay9 {
    public static Inter function(){

        return new Inter(){
            public void method(){
                System.out.println("匿名内部类");
            }
        };
    }

    public static void main(String[] args) {
        NeiBuLeiDay9.function().method();
    }
}


interface Inter
{
   public abstract void method();
}
