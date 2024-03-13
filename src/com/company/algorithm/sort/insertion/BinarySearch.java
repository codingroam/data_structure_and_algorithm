package com.company.algorithm.sort.insertion;


/**
 * 对有序数组进行二分查找，返回目标值在数组中的位置,若找不到返回-1
 */
public class BinarySearch {
    public static int getIndex(int[] nums,int target){

        //左闭右闭写法 [left,right]
        int left = 0;
        int right = nums.length - 1;

        while(left<=right){

            int middle = (left + right) / 2;

            if(target < nums[middle]){

                right = middle - 1;

            }else if(target > nums[middle]){

                left = middle + 1;

            }else{

                return middle;
            }
        }

        return -1;
    }
}
