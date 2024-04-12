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
        int pp = nums[0];
        int p = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int temp = p;
            p = Math.max(p, pp + nums[i]);
            pp = temp;
        }
        return pp;
    }

}
