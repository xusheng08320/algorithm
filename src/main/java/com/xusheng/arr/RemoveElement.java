package com.xusheng.arr;

import org.junit.Test;

public class RemoveElement {

    @Test
    public void test() {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
