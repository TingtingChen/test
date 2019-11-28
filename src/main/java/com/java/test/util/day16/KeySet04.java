package com.java.test.util.day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by chentingting on 2019/11/16.
 */
public class KeySet04 {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String,String>();
        map.put("01","zhangsan01");
        map.put("02","zhangsan02");
        map.put("03","zhangsan03");
        map.put("04","zhangsan04");

        Set<String> keySet = map.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = map.get(key);
            System.out.println("key:" + key +",value:" + value);
        }
    }
}
