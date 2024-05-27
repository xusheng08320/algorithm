package com.xusheng.arr;

public class Rotate {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        swapNums(nums, 0, nums.length - 1);
        swapNums(nums, 0, k - 1);
        swapNums(nums, k, nums.length - 1);
    }

    private void swapNums(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
