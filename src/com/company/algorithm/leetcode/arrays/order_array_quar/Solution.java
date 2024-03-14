package com.company.algorithm.leetcode.arrays.order_array_quar;


/**
 * 双指针解法，有序数组双边平方最大，双针针从双边向中间推进，推进过程中比较大小，依次放入
 */
class Solution {
    public int[] sortedSquares(int[] nums) {

        int length = nums.length;
        int[] newNums = new int[length];
        
        int left = 0;
        int right = length-1;
        while(left <= right){
            if(nums[left] * nums[left] > nums[right] * nums[right]){
                newNums[--length] = nums[left] * nums[left];
                left++;
            }else{
                newNums[--length] = nums[right] * nums[right];
                right--;
            }
        }

        return newNums;




    }
}