package com.java.test.util.day21;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by chentingting07 on 2019/12/4.
 */
public class StudentInfoTest09 {
    public static void main(String[] args) throws IOException{
        Comparator<Student> cmp = Collections.reverseOrder();
        Set<Student> set = studentInfoTools(cmp);
        saveToFile(set);
    }
    public static void saveToFile(Set<Student> set){
        FileWriter fw = null;
        try {
            BufferedWriter bw = new BufferedWriter(fw = new FileWriter("stud.txt"));
            for (Student s : set){
                bw.write(s.toString() + "\t");
                bw.write(s.getScore() + "");
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e){
            throw new RuntimeException("写入失败");
        }finally {
            if(fw != null)
                try{
                    fw.close();
                } catch (IOException e){
                    throw new RuntimeException("写入失败");
                }

        }
    }
    public static Set<Student> studentInfoTools(Comparator<Student> cmp) throws IOException{
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        Set<Student> set = null;
        if(cmp == null)
            set = new TreeSet<Student>();
        else
            set = new TreeSet<Student>(cmp);
        while ((s = bufr.readLine()) != null){
            if ("over".equals(s))
                break;
            else {
                String[] arr = s.split(",");
                set.add(new Student(arr[0], Integer.parseInt(arr[1]),
                        Integer.parseInt(arr[2]), Integer.parseInt(arr[3])));
            }
        }
        return set;
    }
}
class Student implements Comparable<Student>{
    private String name;
    private int ma,cn,en;
    private int score;
    Student(String name, int ma, int cn, int en){
        this.name = name;
        this.ma = ma;
        this.cn = cn;
        this.en = en;
        this.score = ma+cn+en;
    }
    @Override
    public int compareTo(Student s) {
        int num = new Integer(this.score).compareTo(new Integer(s.score));
        if (num == 0)
            return this.name.compareTo(s.name);
        return num;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }

    public String toString(){
        return name +":" +ma+"," + cn + "," +en;
    }
    public int hashCode(){
        return this.name.hashCode() + this.score*27;
    }
    public boolean equals(Object obj){
        if (!(obj instanceof Student))
            throw new ClassCastException("类型不匹配");
        Student s = (Student)obj;
        return this.name.equals(s.name) && this.score == s.score;
    }
}