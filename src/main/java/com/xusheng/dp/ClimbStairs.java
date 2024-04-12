package com.xusheng.dp;

import org.junit.Test;

public class ClimbStairs {

    @Test
    public void test() {
        int n = 3;
        System.out.println(climbStairs(n));
    }

    public int climbStairs(int n) {
        int p = 0;
        int pp = p;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            pp = p;
            p = result;
            result = p + pp;
        }
        return result;
    }
}
