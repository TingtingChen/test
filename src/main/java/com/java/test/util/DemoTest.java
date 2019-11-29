package com.java.test.util;

import java.util.Iterator;
import java.util.Map;
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
        Set<Map.Entry<Character, Integer>> entrySet = treeMap.entrySet();
        Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator();
        StringBuffer sb = new StringBuffer();
        while (it.hasNext()){
            Map.Entry<Character, Integer> m = it.next();
            sb.append(m.getKey()+":" + m.getValue()+",");
        }
        return sb.toString();
    }
}
