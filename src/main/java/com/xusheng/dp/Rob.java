package com.xusheng.dp;

import org.junit.Test;

public class Rob {

    @Test
    public void testRob() {
        int[] arr = new int[]{1, 2, 3, 1};
        System.out.println(rob(arr));
    }

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }

}
