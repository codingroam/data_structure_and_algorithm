package com.company.algorithm;

class Solution {
    public static int minSubArrayLen(int target, int[] nums) {



        int diff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int temptotal = 0;
            for(int j=i;j<nums.length;j++){
                temptotal += nums[j];
                if(temptotal == target){
                    if(j-i<diff){
                        diff = j-i+1;

                    }


                }

            }
        }

        return diff == Integer.MAX_VALUE ? 0 : diff;

    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i = Solution.minSubArrayLen(11, arr);
        System.out.println(i);


    }
}