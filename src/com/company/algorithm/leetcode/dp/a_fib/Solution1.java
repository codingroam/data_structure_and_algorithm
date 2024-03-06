package com.company.algorithm.leetcode.dp.a_fib;

/**
 * @Description TODO
 * @Author wangkai
 * @Date 2024/3/4 22:18
 */
public class Solution1 {

    int fib(int n) {
        if (n == 0 || n == 1) {
            // base case
            return n;
        }
        // 分别代表 dp[i - 2] 和 dp[i - 1]
        int dp_i_1 = 0, dp_i_2 = 1;
        for (int i = 2; i <= n; i++) {
            // dp[i] = dp[i - 1] + dp[i - 2];
            int dp_i = dp_i_1 + dp_i_2;
            // 滚动更新
            dp_i_1 = dp_i_2;
            dp_i_2 = dp_i;
        }
        return dp_i_2;
    }

}
