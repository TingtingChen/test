package com.java.test.util;

/**
 * Created by chentingting on 2019/11/20.
 */
public class Temp {
    public static void main(String args[]) {
        Thread t = new Thread()
        { public void run() {
            pong();
        }
        };

        t.run();
        System.out.print("ping");

    } static void pong() {

        System.out.print("pong");

    }
}


