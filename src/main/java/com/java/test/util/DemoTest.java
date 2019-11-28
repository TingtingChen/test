package com.java.test.util;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by chentingting on 2019/11/21.
 */
public class DemoTest {
    public static void main(String[] args){
        String s = "abbbc";
        System.out.println(charCount(s));

    }
    public static String charCount(String s){
        char[] arr = s.toCharArray();
        TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>();
        for(int x= 0; x<arr.length; x++){
             if(treeMap.containsKey(arr[x])){
                 treeMap.put(arr[x], treeMap.get(arr[x])+1);
             }
             else
                 treeMap.put(arr[x],1);
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keyset = treeMap.keySet();
        Iterator<Character> it = keyset.iterator();
        while (it.hasNext()){
            Character key = it.next();
            Integer value = treeMap.get(key);
            sb.append(key + ":" + value);
            if (it.hasNext())
                sb.append(",");
        }
        return sb.toString();
    }
}
