package com.company.algorithm.leetcode.dp.d_different_route;

/**
 * 1.dp值含义
 * dp[i][j]表示机器人到达i行j列有多少种不同路径
 *
 * 2.状态转移方程：
 * dp[i][j] = dp[i-1][j] + dp[i][j-1];
 *
 * 3.dp数组初始化
 * 初始化最上方和最左面数组值，
 * 原因：
 * ①只能向右和向下走，所以最上方和最左边数组值都为1
 * ②初始化后可以自上而下，自左向右遍历求出所有值
 */

class Solution {
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];
        //初始化左边(第0列)
        for(int i=0;i<m;i++){
            dp[i][0] = 1;
        }

        //初始化上边(第0行)
        for(int j=0;j<n;j++){
            dp[0][j] = 1;
        }

        //根据第0列和第0行，递推出所有dp值
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];

    }
}