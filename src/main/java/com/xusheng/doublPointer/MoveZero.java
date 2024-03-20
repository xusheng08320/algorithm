package com.xusheng.doublPointer;

import org.junit.Test;

import java.util.jar.JarEntry;

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
        int firstZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[firstZeroIndex] = nums[i];
                if (i != firstZeroIndex) {
                    nums[i] = 0;
                }
                firstZeroIndex++;
            }
        }
    }

}
