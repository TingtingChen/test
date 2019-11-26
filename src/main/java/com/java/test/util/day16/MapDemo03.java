package com.java.test.util.day16;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chentingting on 2019/11/16.
 */
public class MapDemo03 {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String,String>();
        // 添加元素，如果出现添加时相同的键。那么后添加的值会覆盖原有键对应的值。并且put方法返回被覆盖的值
        System.out.println("put1:" + map.put("01","zhangsan01"));
        System.out.println("put2:" + map.put("01","lisi01"));
        map.put("02","zhangsan02");
        map.put("03","zhangsan03");
        map.put("04","zhangsan04");
        map.put("05",null);

        System.out.println("comtainsKey:" + map.containsKey("02"));    //也可以通过get方法的返回值来判断一个键是否存在。通过返回null来判断。
        System.out.println("get:" + map.get("02"));
        System.out.println("remove:" + map.remove("02"));

        System.out.println(map);

    }

}
