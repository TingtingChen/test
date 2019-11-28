package com.weather.test;

import com.java.test.util.day04.ArrayUtilDay4;

public class Test {
    public static void  main(String[] args){

//        Test.bubbleSortTest();
//        JavaDay3.dengYao();
        ArrayUtilDay4.toHex(60);
        ArrayUtilDay4.toOct(60);
        ArrayUtilDay4.toBin(6);
    }
    //sort方法测试
    public static void selectSortTest(){
        int[] arr = {4,3,2,5,6,3,2,1};
        System.out.print("Before sort: ");
        ArrayUtilDay4.printArr(arr);
        ArrayUtilDay4.selectSort(arr);
        System.out.print("After sort: ");
        ArrayUtilDay4.printArr(arr);
    }

    //bubbleSort方法测试
    public static void bubbleSortTest(){
        int[] arr = {9,8,1,7,6,5,4,3,2,1};
        System.out.print("Before bubble sort: ");
        ArrayUtilDay4.printArr(arr);
        ArrayUtilDay4.bubbleSort(arr);
        System.out.print("After bubble sort: ");
        ArrayUtilDay4.printArr(arr);
    }

    public static void maxTest(){
        int[] arr = {9,8,1,7,6,5,4,3,2,1};
        int max = ArrayUtilDay4.max(arr);
        System.out.println("数组中的最大值是：" + max);
    }

}
