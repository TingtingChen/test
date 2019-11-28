package com.java.test.util.day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by chentingting on 2019/11/15.
 */
public class TreeSetTest05 {
    public static void main(String[] args){
        TreeSet ts = new TreeSet(new StrLenCompare());

        ts.add("sdfkj");
        ts.add("adksj");
        ts.add("jskdfjksj");
        ts.add("klkoiokm");
        ts.add("lkko/l;k;o;;");

        Iterator it = ts.iterator();
        while (it.hasNext()){
            sop(it.next());
        }
    }
    public static void sop(Object obj){
        System.out.println(obj);
    }

}
class StrLenCompare implements Comparator {
    public int compare(Object o1, Object o2){
        if (!(o1 instanceof String) || !(o1 instanceof String)){
            throw new RuntimeException("不是字符串");
        }
        String s1 = (String)o1;
        String s2 = (String)o2;
        /*if (s1.length()>s2.length())
            return 1;
        if (s1.length() == s2.length()){
            return s1.compareTo(s2);
        }
        return -1;
        */
        int num = ((Integer)s1.length()).compareTo((Integer)s2.length());
        if (num == 0)
            return s1.compareTo(s2);
        return num;
    }
}
