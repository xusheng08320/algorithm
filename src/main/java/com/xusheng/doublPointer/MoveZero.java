package com.xusheng.doublPointer;

import org.junit.Test;

public class MoveZero {

    @Test
    public void testMoveZero() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int firstNotZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(firstNotZeroIndex, i, nums);
                firstNotZeroIndex++;
            }
        }
    }

    private void swap(int firstNotZeroIndex, int curIndex, int[] nums) {
        int temp = nums[firstNotZeroIndex];
        nums[firstNotZeroIndex] = nums[curIndex];
        nums[curIndex] = temp;
    }

}
