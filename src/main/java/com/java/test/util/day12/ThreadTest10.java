package com.java.test.util.day12;

/**
 * Created by chentingting on 2019/11/1.
 */
public class ThreadTest10 {
    public static void  main(String[] args){
        new Thread(){
            public void run(){
                for (int x=0; x<100; x++){
                    System.out.println(Thread.currentThread().getName() + "..." + x);
                }
            }
        }.start();



        for (int x=0; x<100; x++){
            System.out.println(Thread.currentThread().getName() + "..." + x);
        }
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int x=0; x<100; x++){
                    System.out.println(Thread.currentThread().getName() + "..." + x);
                }
            }
        };
        new Thread(r).start();

    }

}
