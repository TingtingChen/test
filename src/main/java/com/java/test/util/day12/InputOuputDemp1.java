package com.java.test.util.day12;

/**
 * Created by chentingting on 2019/10/28.
 */
public class InputOuputDemp1 {
    public static void main(String[] args){
        Product p = new Product();
        Producter pro =  new Producter(p);
        Consummer con = new Consummer(p);
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
class Product{
    private String product;
    int count;
    public boolean flag = false;
    public synchronized void set(String product){
        while (this.flag)
            try{this.wait();} catch (Exception e){e.printStackTrace();}
        this.product = product + "--" + count++;      //注意：这里必须写在wait下面，因为若写在上面，在执行第二次生成的时候会跳过打印，直接输出
        System.out.println(Thread.currentThread().getName()+ "+生产者+" + this.product);
        flag = true;
        this.notifyAll();
    }
    public synchronized void out(){
        while (!this.flag)
            try{this.wait();} catch (Exception e){e.printStackTrace();}
        System.out.println( Thread.currentThread().getName()+ "+消费者......+" + this.product);
        flag = false;
        this.notifyAll();
    }

}

class Producter implements Runnable{
    private Product p;
    Producter(Product p){
        this.p = p;
    }
    public void run(){
        int i = 0;
        while (i<1000){
            p.set("商品");
            i++;
        }
    }
}

class Consummer implements Runnable {
    private Product p;

    Consummer(Product p) {
        this.p = p;
    }

    public void run() {
        int i = 0;
        while (i<1000) {
            p.out();
            i++;
        }

    }
}
