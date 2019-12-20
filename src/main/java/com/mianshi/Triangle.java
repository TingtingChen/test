package com.mianshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by chentingting07 on 2019/12/8.
 */
public class Triangle {
    public static void main(String[] args) throws IOException{
//       System.out.print(isZhiJiao(10000,3,4));
        System.out.println(isZhiJiao1());
    }
    public static boolean isZhiJiao(int a, int b, int c){
        if((a>1000 || a < 1) || (b>1000 || b < 1) ||(c>1000 || c < 1)){
            throw new RuntimeException("请输入1-1000之内的整数");
        }
        int[] i ={a,b,c};
        for (int x = 0; x<i.length-1; x++){
            for (int y = 1; y<i.length; y++){
                if(i[x] > i[y]){
                    int temp = i[x];
                    i[x] =  i[y];
                    i[y] = temp;
                }
            }
        }
        if (((i[0] + i[1])<=i[2]) || ((i[2]-i[1])>=i[0])){
            throw  new RuntimeException("请输入符合勾股定理的整数");
        }
        if ((Math.pow(i[0],2)+Math.pow(i[1],2)) == Math.pow(i[2],2)){
            return true;
        }
        else
            return false;
    }

    public static boolean isZhiJiao1() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("请输入三角形的三个边长度：");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        br.close();
        if ((a+b)>c && (a+c)>b && (b+c)>a){
            if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a))
                return true;
            else
                return false;
        }
        else
            System.out.println("不是三角形");
        return false;
    }
}
