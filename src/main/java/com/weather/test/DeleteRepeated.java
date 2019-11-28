package com.weather.test;


import java.util.Scanner;
import java.util.TreeSet;

public class DeleteRepeated {

    private String str;
    private TreeSet<String> noReapted;//带有String类型的TreeSet泛型

    public DeleteRepeated() {
        Scanner in = new Scanner(System.in);

        System.out.println ("输入一个字符串:");
        str = in.nextLine();

        noReapted = new TreeSet();
    }

    //清楚重复的数据
    public void removeRepeated(){
        for (int i = 0; i < str.length(); i++){
            noReapted.add(""+str.charAt(i));
            //str.charAt(i)返回的是char型  所以先加一个""空格 , 转换成String型
            //TreeSet泛型能保证重复的不加入 , 而且有序
        }

        str = "";

        for(String index:noReapted){
            str += index;
            System.out.println(str);
        }

        //输出
        System.out.println (str);
    }

    public static void main(String[] args) {
        DeleteRepeated dr = new DeleteRepeated();

        dr.removeRepeated();
    }
}
