package com.xusheng.dp;

import org.junit.Test;

public class NumSquares {

    @Test
    public void test() {
        int n = 12;
        System.out.println(numSquares(n));
    }

    public int numSquares(int n) {
        int max = n + 1;
        int[] dp = new int[max];
        for (int i = 1; i < max; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
