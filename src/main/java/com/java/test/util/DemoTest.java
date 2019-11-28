package com.java.test.util;

import java.util.Iterator;
<<<<<<< HEAD
=======
import java.util.Map;
>>>>>>> 2e9856897618f36e2af433128d2a398cbad4e6ec
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
<<<<<<< HEAD
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
=======
        char[] c = s.toCharArray();
        TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>();
        int count = 0;
        for (int x=0; x<c.length; x++){
            Integer v = treeMap.get(c[x]);
            if(v!=null){
                count = v;
            }
            count++;
            treeMap.put(c[x],count);
            count = 0;
        }
        Set<Map.Entry<Character, Integer>> entrySet = treeMap.entrySet();
        Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator();
        StringBuffer sb = new StringBuffer();
        while (it.hasNext()){
            Map.Entry<Character, Integer> m = it.next();
            sb.append(m.getKey()+":" + m.getValue()+",");
>>>>>>> 2e9856897618f36e2af433128d2a398cbad4e6ec
        }
        return sb.toString();
    }
}
