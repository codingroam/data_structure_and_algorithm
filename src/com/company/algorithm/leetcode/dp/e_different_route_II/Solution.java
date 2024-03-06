package com.company.algorithm.leetcode.dp.e_different_route_II;


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
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {



        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        //初始化左边(第0列)
        for(int i=0;i<m;i++){
            //初始化过程中出现1(障碍)则不用再初始化后面dp值(dp=0 不可达)
            if(obstacleGrid[i][0] == 1)
            {
                break;
            }
            dp[i][0] = 1;
        }

        //初始化上边(第0行)
        for(int j=0;j<n;j++){
            //初始化过程中出现1(障碍)则不用再初始化后面dp值(dp=0 不可达)
            if(obstacleGrid[0][j] == 1){
                break;
            }
            dp[0][j] = 1;
        }

        //根据第0列和第0行，递推出所有dp值
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                //obstacleGrid[i][j] == 0才表示[i][j]可达，可以用方程推导，否则不可达dp值为0
                if(obstacleGrid[i][j] == 0){
                     dp[i][j] = dp[i-1][j] + dp[i][j-1];

                }
               
            }
        }

        return dp[m-1][n-1];

    }

    
}