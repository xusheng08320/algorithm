package com.xusheng.dp;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;
import org.junit.Test;
import org.junit.experimental.max.MaxHistory;

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
            max = Math.max(nums[i], Math.max(nums[i] * min, nums[i] * max));
            min = Math.min(nums[i], Math.min(nums[i] * min, nums[i] * maxTemp));
            result = Math.max(result, Math.max(max, min));
        }
        return result;
    }
}
