package com.java.test.util.day04;

/**
 * Created by chentingting on 2019/8/13.
 */

public class ArrayUtilDay4 {
    //获取数组中的元素
//    int[] arr = new int[]{4,2,3,3,3,5,1};

    /**
     * 传入一个数组，然后将数组打印出来
     * @param array
     */
    public static void printArr(int[] array){
        for (int x = 0 ; x < array.length ; x++){
            if(x == 0)
                System.out.print("[");
            if(x < array.length - 1)
                System.out.print(array[x] + ",");
            else
                System.out.print(array[x] + "]\n");
        }

    }

    /**
     * 选择排序，将数组根据从小到大顺序排序
     * @param array
     * @return
     */
    public static void selectSort(int[] array){
        for (int x = 0 ; x < array.length-1 ; x++){
            for (int y = x + 1 ; y < array.length ; y++){
                if (array[x] > array[y]){
                    ArrayUtilDay4.swap(x, y);
                }
            }
        }
    }

    /**
     * 冒泡排序，将数组根据冒泡排序方法从小到大排序
     * @param array
     * @return
     */
    public static void bubbleSort(int[] array){
        for (int x = 0 ; x < array.length -1 ; x++){
            for (int y = 0 ; y < array.length - x - 1; y++){  //-x的目的是让比较的元素坚守，-1：避免角标越界
                if (array[y] > array[y+1]){
                    ArrayUtilDay4.swap(y, y+1);
                }
            }
        }
    }

    /**
     * 获取数组中的最大值
     * @param arr
     * @return
     */
    public static int max(int[] arr){
        int max = 0;
        for (int x = 1 ; x < arr.length ; x++){
            if (arr[max] < arr[x]){
                max = x;
            }
        }
        return arr[max];
    }


    private static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }


    public static int zheBanSerach(int[] arr, int x){
        int min=0, max=arr.length-1;
        int mid=(min+max)/2;
//        while (min<=max){
//            if (x == arr[mid])
//                return mid;
//            else if (x > arr[mid])
//                min = mid+1;
//            else if (x < arr[mid])
//                max = mid-1;
//            mid = (min+max)/2;
//        }
//        return -1;
        while (arr[mid]!=x){
            if (x > arr[mid])
                min = mid +1;
            else if (x < arr[mid])
                max = mid - 1;
            if(max>min)
                return -1;
            mid = (max+min)/2;
        }
        return mid;
    }

    /**
     * 十进制转换十六进制
     * @param num
     */
    public static void toHex(int num){
        StringBuffer sb = new StringBuffer();
        for (int x=0; x<8; x++){
            int temp = num & 15;
            if (temp > 9)
                sb.append((char) (temp - 10 + 'A'));
            else
                sb.append(temp);
            num = num >>> 4;
        }
        System.out.println(sb.reverse());
    }

    /**
     * 查表法：十进制转十六进制
     * @param num
     */
    public static void toHex2(int num){
        ArrayUtilDay4.trans(num, 15, 4);
    }

    /**
     * 查表法 十进制转八进制
     * @param num
     */
    public static void toOct(int num){
        ArrayUtilDay4.trans(num, 7, 3);
    }

    /**
     * 查表法 十进制转二进制
     * @param num
     */
    public static void toBin(int num){
        ArrayUtilDay4.trans(num, 1, 1);
    }


    /**
     * 查表法：十进制转换为多进制
     * @param num 十进制数据
     * @param base
     * @param offset
     */
    private static void trans(int num, int base, int offset){
        if(num == 0){
            System.out.print(0);
            return;
        }
        char[] chs = {'0','1','2','3'
                ,'4','5','6','7'
                ,'8','9','A','B'
                ,'C','D','E','F'};
        char[] arr = new char[32];
        int pos = arr.length;
        while (num != 0){
            int temp = num & base;
            arr[--pos] = chs[temp];
            num = num >>> offset;
        }
        for (int x = pos; x<arr.length; x++)
            System.out.print(arr[x]);
    }






}
