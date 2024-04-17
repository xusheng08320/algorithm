package com.xusheng.dp;

import org.junit.Test;

public class MinCostClimbingStairs {

    @Test
    public void test() {
        int[] cost = new int[]{10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
    }

    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if (len < 2) {
            return 0;
        }
        int[] dp = new int[len];
        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        int result = Math.min(dp[len - 1] + cost[len - 1], dp[len - 2] + cost[len - 2]);
        return result;
    }
}
