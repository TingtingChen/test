package com.java.test.util.day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by chentingting on 2019/11/22.
 */
public class ForDemo18 {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("abc1");
        al.add("abc2");
        al.add("abc3");

        for(String s : al){
            System.out.println(s);
        }

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1,"abc1");
        hm.put(2,"abc2");
        hm.put(3,"abc3");
        Set<Integer> keySet = hm.keySet();
        for(Integer i : keySet){
           System.out.println(i + ":" + hm.get(i));
        }
        Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();
        for (Map.Entry<Integer, String> me: entrySet){
            System.out.println(me.getKey() + ":" + me.getValue());
        }

    }
}
