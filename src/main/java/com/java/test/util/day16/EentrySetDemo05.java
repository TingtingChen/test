package com.java.test.util.day16;

import java.util.*;

/**
 * Created by chentingting on 2019/11/16.
 */
public class EentrySetDemo05 {
    public static void main(String[] args){
        int []  arr = {2,3,3,4};
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println(arr2);

        Map<String,String> map = new HashMap<String,String>();
        map.put("01","zhangsan01");
        map.put("02","zhangsan02");
        map.put("03","zhangsan03");
        map.put("04","zhangsan04");
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,String>>  it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry<String,String> me = it.next();
            System.out.print(me.getKey() + "=");
            System.out.println(me.getValue());
        }
    }
}
