package com.java.test.util.day17;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by chentingting on 2019/11/21.
 */
public class ToArrayTest {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("abc1");
        al.add("abc2");
        al.add("abc3");
        String[] s = al.toArray(new String[al.size()]);
        System.out.print(Arrays.toString(s));

    }
}
