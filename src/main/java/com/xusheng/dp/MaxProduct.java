package com.xusheng.dp;

import org.junit.Test;

public class MaxProduct {

    @Test
    public void test() {
        int[] nums = new int[]{2, 3, -2, 4};
        System.out.println(maxProduct(nums));
    }

    public int maxProduct(int[] nums) {
        int maxDp = nums[0];
        int minDp = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int maxF = maxDp;
            int minF = minDp;
            maxDp = Math.max(maxF * nums[i], Math.max(minF * nums[i], nums[i]));
            minDp = Math.min(maxF * nums[i], Math.min(minF * nums[i], nums[i]));
            result = Math.max(minDp, Math.max(result, maxDp));
        }
        return result;
    }
}
