package com.java.test.util.day11;

/**
 * Created by chentingting on 2019/10/26.
 */
class Bank
{
    private static int sum;
//    Object obj = new Object();
    public synchronized void add(int num)
    {

//        synchronized(obj){
            sum = sum + num;
            try{Thread.sleep(10);} catch (Exception e){}
            System.out.println("sum = "+sum);
//        }
    }
}

class Cun implements Runnable
{
    private Bank b = new Bank();
    public void run()
    {
        for(int x=0; x<3 ;x++)
        {
            b.add(100);
        }

    }
}

class Demo1
{
    public static void main(String[] args)
    {
        Cun cun = new Cun();
        Thread t1  = new Thread(cun);
        Thread t2  = new Thread(cun);
        t1.start();
        t2.start();
    }
}
