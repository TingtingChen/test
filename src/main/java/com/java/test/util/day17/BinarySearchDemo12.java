package com.java.test.util.day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by chentingting on 2019/11/19.
 */
public class BinarySearchDemo12 {
    public static void main(String[] args){
        binarySearchDemo();
    }
    public static void binarySearchDemo(){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("zhangsan", 22));
        list.add(new Student("lisi", 12));
        list.add(new Student("lili", 16));
        list.add(new Student("chencheng", 16));
        list.add(new Student("wangwu", 18));
//        Collections.sort(list);
//        System.out.println(list);
//        int index = Collections.binarySearch(list, new Student("zhangsan",22));
//
//        System.out.println(index);
//        Collections.sort(list);
//        int myIndex = halfSearch(list, new Student("zhangsan",22));
//        System.out.println("myIndex1:" +myIndex);


        Collections.sort(list, new StuNameLenComparator());
        System.out.println(list);
        int index = Collections.binarySearch(list, new Student("zhaoliu",22), new StuNameLenComparator());
        System.out.println("binarySearch:" + index);

        int myIndex2 = halfSearch2(list, new Student("zhaoliu",22), new StuNameLenComparator());
        System.out.println("myIndex2:" +myIndex2);

    }

    //二分法查找
    public static <T extends Comparable<? super T>> int halfSearch(List<? extends T> list, T key){
        int max,min,mid;
        max = list.size()-1;
        min = 0;
        while (max>=min){
            mid = (max+min)/2; //  mid = (max+min)>>1;
            T t = list.get(mid);
            int num = t.compareTo(key);
            if (num>0)
                max = mid-1;
            else if (num<0)
                min = mid+1;
            else
                return mid;
        }
        return -min-1;

    }
    //二分法查找+自定义比较器
    public static <T extends Comparable<? super T>> int halfSearch2(List<? extends T> list, T key, Comparator<T> com){
        int max,min,mid;
        max = list.size()-1;
        min = 0;
        while (max>=min){
            mid = (max+min)/2; //  mid = (max+min)>>1;
            T t = list.get(mid);
            int num = com.compare(t, key);
            if (num>0)
                max = mid-1;
            else if (num<0)
                min = mid+1;
            else
                return mid;
        }
        return -min-1;

    }
}

