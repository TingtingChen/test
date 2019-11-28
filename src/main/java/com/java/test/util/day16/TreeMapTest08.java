package com.java.test.util.day16;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by chentingting on 2019/11/18.
 */
public class TreeMapTest08 {
    public static void main(String[] args){
        String s = "adfgzxcvasdfxcvdf";
        //把字符串转换为数组。
        System.out.println(charCount(s));

    }
    public static String charCount(String s){
        char[] c = s.toCharArray();
        TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>();
        int count = 0;
        for (int x=0; x<c.length; x++){
//            if (treeMap.containsKey(c[x]))
//                treeMap.put(c[x],treeMap.get(c[x])+1);
//            else treeMap.put(c[x],1);
            //另一种方式
            if (!((c[x]>='a' && c[x]<='z')||(c[x]>='A' && c[x]<='Z')))
                continue;
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
//            System.out.print(m.getKey() + "(" + m.getValue() + ")");
            sb.append(m.getKey()+"(" + m.getValue() + ")");
        }
        return sb.toString();
    }
}
