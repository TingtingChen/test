package com.java.test.util.day12;

/**
 * Created by chentingting on 2019/10/29.
 */
public class StopThreadDemo06 {
    public static void main(String[] args){
        StopThread stop = new StopThread();
        Thread t1 = new Thread(stop);
        Thread t2 = new Thread(stop);
        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();

        int num = 0;
        while (true){
            if (num++ == 60){
                break;
            }
            System.out.println(Thread.currentThread().getName() + "....." + num );
        }
        System.out.println("over");
    }
}

class StopThread implements Runnable{
    boolean flag = true;
    public void run(){
        while (flag)
        System.out.println(Thread.currentThread().getName() + "..run");
    }
    public void changeFlag(){
        flag = false;
    }
}
