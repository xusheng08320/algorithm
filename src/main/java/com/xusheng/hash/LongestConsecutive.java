package com.xusheng.hash;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    @Test
    public void testLongestConsecutive() {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i] - 1)) {
                continue;
            }
            int max = 1;
            while (set.contains(nums[i] + max)) {
                max++;
            }
            result = Math.max(result, max);
        }
        return result;
    }
}
