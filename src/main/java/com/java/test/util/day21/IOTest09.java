package com.java.test.util.day21;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by chentingting07 on 2019/12/4.
 */
public class IOTest09 {
    public static void main(String[] args) throws IOException{
        saveToFile(saveInputToSet());
    }
    public static void saveToFile(Set<Score> set){
        FileWriter fw = null;
        try {
            BufferedWriter bw = new BufferedWriter(fw = new FileWriter("stud.txt"));
            for (Score s : set){
                bw.write(s.toString());
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

    public static String keyBoardInput() throws IOException{
        BufferedInputStream bis = new BufferedInputStream(System.in);
        StringBuilder sb = new StringBuilder();
        int ch = 0;
        while (true){
            ch = bis.read();
            if(ch =='\r')
                continue;
            if(ch =='\n') {
                if(sb.toString() != "over"){
                    return sb.toString();
                }
                else
                    break;
            }
            else
                sb.append((char)ch);
        }
        return sb.toString();
    }

    public static Set<Score> saveInputToSet() throws IOException{
        Set<Score> set = new TreeSet<Score>();
        try {
            String input = null;
            while (input != "over"){
                input = keyBoardInput();
                String[] strs = input.split(",");
                int sum = 0;
                for (int x = 1 ; x<strs.length; x++){
                    sum += Integer.parseInt(strs[x]);
                }
                set.add(new Score(strs[0], sum));
            }
        }catch (ArrayIndexOutOfBoundsException e){
           System.out.print(e.toString());
        }
        return set;
    }
}
class Score implements Comparable{
    private String name;
    private int score;
    Score(String name, int score){
        this.name = name;
        this.score = score;
    }
    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Score))
            throw new RuntimeException("类型错误");
        Score s = (Score)o;
        int num = String.valueOf(s.score).compareTo(String.valueOf(this.score));
        if (num == 0)
            return this.name.compareTo(s.name);
        return num;
    }
    public String toString(){
        return name +":" +score;
    }
}