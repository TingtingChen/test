package com.java.test.util.day13;

/**
 * Created by chentingting on 2019/11/12.
 */
public class StringBuffer1011 {
    public static void main(String[] args){
//        method_add();
//        method_delete();
//        method_replace();
        // 将缓冲区中的指定数据存储到指定字符数组中。
        StringBuffer sb = new StringBuffer("abceskd");
        char[] c = new char[6];
        sb.getChars(1,3, c, 1);
        for(int i=0;i<c.length; i++){
            StringDemo02.sop("c[" + i + "]=" + c[i]);
        }

    }

    public static void method_add(){
        StringBuffer sb = new StringBuffer();
        sb.append("abc").append(34).append(true);
        sb.insert(1,"111");
        StringDemo02.sop(sb);
    }
    public static void method_delete(){
        StringBuffer sb = new StringBuffer("abceskd");
        sb.delete(1,3);
        StringDemo02.sop(sb);
        sb.deleteCharAt(1);
        StringDemo02.sop(sb);
        sb.delete(0,sb.length());
    }
    public static void method_replace(){
        StringBuffer sb = new StringBuffer("abceskd");
        sb.replace(1,3,"java");
        StringDemo02.sop(sb);
        sb.setCharAt(2,'1');
        StringDemo02.sop(sb);
    }

}
