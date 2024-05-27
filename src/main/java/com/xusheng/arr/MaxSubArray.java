package com.xusheng.arr;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = Math.max(nums[i], Math.max(pre + nums[i], result));
            pre = Math.max(pre + nums[i], nums[i]);
        }
        return result;
    }
}
