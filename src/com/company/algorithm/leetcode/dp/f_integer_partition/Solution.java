package com.company.algorithm.leetcode.dp.f_integer_partition;

/**
 * dp[i] = 整数i的拆分相乘最大值
 *
 * 递推公式：
 * ① 拆分成两个数 ：dp[i] = j * (i - j)
 * ② 拆分成两个及以上 ：dp[i] = j * dp[i - j]
 */
class Solution {
    public int integerBreak(int n) {


        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;

        for(int i=3;i<=n;i++){
            for(int j=0;j<=i;j++){
                //内层遍历时，每次j改动都要和dp[i]作比较，保持dp[i]更新成最大值
                dp[i] = Math.max(Math.max(j*(i-j),j*dp[i-j]),dp[i]);
            }
        }

        return dp[n];



    }
}