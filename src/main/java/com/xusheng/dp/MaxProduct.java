package com.xusheng.dp;

import org.junit.Test;

public class MaxProduct {

    @Test
    public void test() {
        int[] nums = new int[]{2, 3, -2, 4};
        System.out.println(maxProduct(nums));
    }

    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int maxTemp = max;
            max = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));
            min = Math.min(nums[i], Math.min(maxTemp * nums[i], min * nums[i]));
            result = Math.max(result, Math.max(max, min));
        }
        return result;
    }
}
