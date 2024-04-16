package com.xusheng.dp;

import org.junit.Test;

public class ClimbStairs {

    @Test
    public void test() {
        int n = 3;
        System.out.println(climbStairs(n));
    }

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int first = 1;
        int second = 2;
        for (int i = 2; i < n; i++) {
            int temp = second;
            second = first + second;
            first = temp;
        }
        return second;
    }
}
