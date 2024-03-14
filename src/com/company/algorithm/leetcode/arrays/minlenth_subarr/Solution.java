package com.company.algorithm.leetcode.arrays.minlenth_subarr;

/**
 * 暴力解法，两层for循环求出所有情况，并记录最小长度
 */
class Solution {
    public int minSubArrayLen(int target, int[] nums) {



        int diff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int temptotal = 0;
            for(int j=i;j<nums.length;j++){
                temptotal += nums[j];
                if(temptotal >= target){
                    if(j-i<diff){
                        diff = j-i+1;

                    }


                }

            }
        }

        return diff == Integer.MAX_VALUE ? 0 : diff;

    }
}