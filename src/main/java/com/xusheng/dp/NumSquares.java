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
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, dp[i - j * j]);
            }
            dp[i] = min + 1;
        }
        return dp[max - 1];
    }
}
