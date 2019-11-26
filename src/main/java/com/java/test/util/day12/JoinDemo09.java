package com.java.test.util.day12;

/**
 * Created by chentingting on 2019/10/30.
 */
public class JoinDemo09 {
    public static void main(String[] args) throws InterruptedException {
        JoinThread join = new JoinThread();
        Thread t1 = new Thread(join);
        Thread t2 = new Thread(join);
        t1.start();
//        t1.join();  //放在这里只有t1在执行，因为t2还没开启线程，主线程就冻结了
        t2.start();
        t1.join();  //放在这里t2会与t1交替进行
        for (int i = 0; i<70; i++){
//            System.out.println(Thread.currentThread().getName() + "-" + i );

        }
        System.out.print("over");
    }

}

class JoinThread implements Runnable{
    public void run(){
        for (int i = 0; i<80; i++){
            System.out.println(Thread.currentThread().getName() + "-----" + i );
            Thread.yield();
        }
    }
}