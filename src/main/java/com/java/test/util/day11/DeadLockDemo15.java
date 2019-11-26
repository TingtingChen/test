package com.java.test.util.day11;

/**
 * Created by chentingting on 2019/10/28.
 */
public class DeadLockDemo15 {
    public static void main(String[] args){
        Thread t1 = new Thread(new DeadLock(true));
        Thread t2 = new Thread(new DeadLock(false));
        t1.start();
        t2.start();
    }

}

class DeadLock implements Runnable{
    private boolean flag;
    public DeadLock(boolean flag){
        this.flag=flag;
    }
    public void run(){
        if(flag){
            synchronized (Lock.obja){
                System.out.println("if obja");
                synchronized (Lock.objb){
                    System.out.println("if objb");
                }
            }
        }
        else {
            synchronized (Lock.objb){
                System.out.println("else objb");
                synchronized (Lock.obja){
                    System.out.println("else objb");
                }
            }
        }
    }
}
class Lock{
    static Object obja = new Object();
    static Object objb = new Object();

}
