package com.company.algorithm.leetcode.dp.b_coinschange;

/**
 * @Description TODO
 * @Author wangkai
 * @Date 2024/3/4 22:44
 */
public class Solution {

    int coinChange(int[] coins, int amount) {
        // 题目要求的最终结果是 dp(amount) dp自顶向下
        return dp(coins, amount);
    }

    // 定义：要凑出金额 n，至少要 dp(coins, n) 个硬币
    int dp(int[] coins, int amount) {
        // base case
        if (amount == 0) return 0;
        if (amount < 0) return -1;

        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            // 计算子问题的结果
            int subProblem = dp(coins, amount - coin);
            // 子问题无解则跳过
            if (subProblem == -1) continue;
            // 在子问题中选择最优解，然后加一
            res = Math.min(res, subProblem + 1);
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }

}
