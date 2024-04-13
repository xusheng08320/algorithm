package com.xusheng.dp;

import org.junit.Test;

public class MaxProduct {

    @Test
    public void test() {
        int[] nums = new int[]{2, 3, -2, 4};
        System.out.println(maxProduct(nums));
    }

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int maxDp = nums[0];
        int minDp = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int maxF = maxDp;
            int minF = minDp;
            maxDp = Math.max(nums[i] * maxF, Math.max(nums[i], nums[i] * minF));
            minDp = Math.min(nums[i] * maxF, Math.min(nums[i], nums[i] * minF));
            result = Math.max(result, Math.max(maxDp, minDp));
        }
        return result;
    }
}
