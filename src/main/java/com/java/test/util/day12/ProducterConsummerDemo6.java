package com.java.test.util.day12;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by chentingting on 2019/10/29.
 */

public class ProducterConsummerDemo6 {
    public static void main(String[] args){
        Product2 p = new Product2();
        Producter2 pro =  new Producter2(p);
        Consummer2 con = new Consummer2(p);
        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(con);
        Thread t3 = new Thread(pro);
        Thread t4 = new Thread(con);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
class Product2{
    private String product;
    int count;
    public boolean flag = false;
    Lock lock = new ReentrantLock();
    Condition condition_pro = lock.newCondition();
    Condition condition_con = lock.newCondition();
    public void set(String product) throws InterruptedException{
        try {
            lock.lock();
            while(flag)
                condition_pro.await();
            this.product = product + "--" + count++;      //注意：这里必须写在wait下面，因为若写在上面，在执行第二次生成的时候会跳过打印，直接输出
            System.out.println(Thread.currentThread().getName()+ "+生产者+" + this.product);
            flag = true;
            condition_con.signal();
        } finally {
            lock.unlock();    //释放锁的动作一定要执行
        }

    }
    public void out() throws InterruptedException{
        try{
            lock.lock();
            while(!flag)
                condition_con.await();
            System.out.println( Thread.currentThread().getName()+ "+消费者......+" + this.product);
            flag = false;
            condition_pro.signal();
        } finally {
            lock.unlock();
        }

    }

}

class Producter2 implements Runnable{
    private Product2 p;
    Producter2(Product2 p){
        this.p = p;
    }
    public void run(){
        try {
            int i = 0;
            while (i<1000){
                p.set("商品");
                i++;
            }
        } catch (InterruptedException e){

        }

    }
}

class Consummer2 implements Runnable {
    private Product2 p;

    Consummer2(Product2 p) {
        this.p = p;
    }

    public void run() {
        try {
            int i = 0;
            while (i<1000){
                p.out();
                i++;
            }
        } catch (InterruptedException e){

        }

    }
}
