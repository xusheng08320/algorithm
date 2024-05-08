package com.xusheng.two;

import org.junit.Test;

public class SearchInsert {

    @Test
    public void test() {
        int[] arr = new int[]{1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(arr, target));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = nums.length;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
                result = mid;
            }
        }
        return result;
    }
}
