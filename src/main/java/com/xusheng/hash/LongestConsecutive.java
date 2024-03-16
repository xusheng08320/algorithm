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
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int result = 0;
        for (int num : nums) {
            if (numSet.contains(num - 1)) {
                continue;
            }
            int curLenth = 1;
            int curNum = num;
            while (numSet.contains(curNum + 1)) {
                curLenth++;
                curNum++;
            }
            result = Math.max(curLenth, result);
        }
        return result;
    }
}
