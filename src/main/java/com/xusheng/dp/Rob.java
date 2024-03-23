package com.xusheng.dp;

import org.junit.Test;

public class Rob {

    @Test
    public void testRob() {

    }

    public int rob(int[] nums) {
        int cur = 0;
        int prev = 0;
        for (int num : nums) {
            int temp = Math.max(cur, prev + num);
            prev = cur;
            cur = temp;
        }
        return cur;
    }

}
