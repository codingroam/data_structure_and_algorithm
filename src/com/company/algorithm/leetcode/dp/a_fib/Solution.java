package com.company.algorithm.leetcode.dp.a_fib;

/**
 * @Description TODO
 * @Author wangkai
 * @Date 2024/3/4 22:11
 */
public class Solution {

    int fib(int N) {
        if (N == 0) return 0;
        //dp数组
        int[] dp = new int[N + 1];
        // base case
        dp[0] = 0; dp[1] = 1;
        // 状态转移
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[N];
    }
}
