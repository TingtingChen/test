package com.leetCode.tencent;

import java.util.Arrays;

/**
 * Created by chentingting07 on 2019/11/23.
 */
public class FindMedian {
    public static void main(String[] args){
        int[] nums1={1,3};
        int[] nums2={2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int result = 0;
        int m = nums1.length;
        int n = nums2.length;
        int[] nums3 = Arrays.copyOf(nums1,m+n);
        for (int i=m,j=0; j<n; i++,j++){
            nums3[i] = nums2[j];
        }
        bubbleSort(nums3);
        return medianSearch(nums3);
    }
    public static void bubbleSort(int[] arr){
        for(int x=0; x<arr.length; x++){
            for(int y=0; y<arr.length-x-1; y++){
                if(arr[y] > arr[y+1]){
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
    }
    public static double medianSearch(int[] arr){
        if(arr.length%2==0){
            return ((double)arr[arr.length/2-1] + (double)arr[arr.length/2])/2;
        }
        else{
            return (double)arr[arr.length/2];
        }
    }
}
