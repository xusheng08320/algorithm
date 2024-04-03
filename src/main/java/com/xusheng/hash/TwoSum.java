package com.xusheng.hash;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer targetNum = map.get(target - nums[i]);
            if (targetNum == null) {
                map.put(nums[i], i);
                continue;
            }
            return new int[]{targetNum, i};
        }
        return new int[2];
    }
}
