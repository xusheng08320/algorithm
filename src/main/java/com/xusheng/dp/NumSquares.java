package com.xusheng.dp;

import org.junit.Test;

public class NumSquares {

    @Test
    public void test() {
        int n = 12;
        System.out.println(numSquares(n));
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, dp[i - j * j]);
            }
            dp[i] = min + 1;
        }
        return dp[dp.length - 1];
    }
}
