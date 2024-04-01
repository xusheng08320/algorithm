package com.xusheng.dp;

import org.junit.Test;

public class Rob {

    @Test
    public void testRob() {
        int[] arr = new int[]{1, 2, 3, 1};
        System.out.println(rob(arr));
    }

    public int rob(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int first = nums[0];
        int second = Math.max(nums[1], nums[0]);
        for (int i = 2; i < nums.length; i++) {
            int temp = second;
            second = Math.max(second, first + nums[i]);
            first = temp;
        }
        return second;
    }

}
