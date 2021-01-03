package com.company.algorithm.sort.insertion;


/**
 * 对有序数组进行二分查找，返回目标值在数组中的位置
 */
public class BinarySearch {
    public static int getIndex(int[] array,int value){
        if(array==null||array.length==0){
            System.out.println("未找到下标");
            return -1;
        }
        int begin = 0;
        int end = array.length;
        while(end>begin){
            int mid = (begin+end)/2;
            if(value>array[mid]){
                begin = mid+1;
            }else if(value<array[mid]){
                end = mid;
            }else{
                System.out.println("找到下标为："+mid);
                return mid;

            }
        }
        System.out.println("未找到下标");
        return -1;
    }
}
