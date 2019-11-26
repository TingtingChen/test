package com.java.test.util.day04;

import java.util.*;

/**
 * Created by chentingting on 2019/11/20.
 */
public class SortDemo04 {
    public static void main(String[] args){
        //选择排序
        Integer[] arr = {5,2,3,5,12,4,8};
        sort(arr);
        List<Integer> arrList = Arrays.asList(arr);
        System.out.println("选择排序:" + arrList.toString());

        //冒泡排序
        Integer[] arr2 = {2,1,3,5,12,4,9};
        bubbleSort(arr2);
        List<Integer> arrList2 = Arrays.asList(arr2);
        System.out.println("冒泡排序:" + arrList2.toString());

        //二分法查找
        System.out.println(binnarySearch(arr2, new Integer(12)));



    }

    //选择排序
    public static Integer[] sort(Integer[] arr){
        for(int x=0; x<arr.length-1; x++){
            for(int y=x+1; y<arr.length; y++){
                if(arr[x] > arr[y]){
                    Integer temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
        return arr;
    }

    //冒泡排序
    public static Integer[] bubbleSort(Integer[] arr){
        for(int x = 0; x<arr.length; x++){
            for(int y = 0; y<arr.length-x-1; y++){
                if(arr[y] > arr[y+1]){
                    Integer temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
        return arr;
    }

    //二分查找法，使用二分法查找必须先排序
    public static Integer binnarySearch(Integer[] arr, Integer key){
        int max,min,mid;
        max=arr.length-1;
        min=0;
        while (max>=min){
            mid=(max+min)/2;
            if(arr[mid]>key){
                max=mid-1;
            }
            else if(arr[mid]<key){
                min=mid+1;
            }
            else
                return mid;
        }
        return -min-1;
    }
}
