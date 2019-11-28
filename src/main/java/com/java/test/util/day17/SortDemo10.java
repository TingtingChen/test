package com.java.test.util.day17;



import java.util.*;

/**
 * Created by chentingting on 2019/11/18.
 */
class SortDemo01 {
    public static void main(String[] args){
        maxDemo();

    }


    public static void maxDemo(){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("zhangsan", 22));
        list.add(new Student("lisi", 12));
        list.add(new Student("lili", 16));
        list.add(new Student("chencheng", 16));
        list.add(new Student("wangwu", 18));
        System.out.println(Collections.max(list));
        System.out.println(Collections.max(list, new StuNameLenComparator()));

    }


    public static void sortDemo(){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("zhangsan", 22));
        list.add(new Student("lisi", 12));
        list.add(new Student("lili", 16));
        list.add(new Student("chencheng", 16));
        list.add(new Student("wangwu", 18));

        Collections.sort(list);

        System.out.println(list);
        Collections.sort(list, new StuNameLenComparator());
        System.out.println(list);
    }
}
class StuNameLenComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
//        System.out.println("compare: " + s1.getName()+"-" + s2.getName());
        int num = ((Integer)(s1.getName().length())).compareTo((Integer)(s2.getName().length()));
        if (num==0)
            return s1.getName().compareTo(s2.getName());
        return num;
    }
}




