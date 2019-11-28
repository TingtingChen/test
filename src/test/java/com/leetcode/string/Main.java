package com.leetcode.string;

import java.util.Arrays;

/**
 * Created by chentingting on 2019/8/30.
 */
public class Main {
    public static void main(String[] args) {
//        NeiBuLeiDay9.function().method();
        int[] nums1={1,2};
        int[] nums2={3,4};
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
        for(int x=0; x<nums3.length; x++){
            for (int y=x+1; y<nums3.length; y++){
                if(nums3[x] > nums3[y]){
                    int temp = nums3[x];
                    nums3[x] = nums3[y];
                    nums3[y] = temp;
                }

            }
        }

        for (int z = 0; z<nums3.length; z++){
            System.out.println(nums3[z]);
        }

        if((nums3.length%2)==0){
            return ((double)(nums3[nums3.length/2-1]) + (double) (nums3[nums3.length/2]))/2;
        }
        if((nums3.length%2)!=0){
            return nums3[nums3.length/2];
        }
        return result;
    }
}
