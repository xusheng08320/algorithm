package com.xusheng.doublPointer;

public class MaxArea {

    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int result = 0;

        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            result = Math.max(area, result);
            if (height[l] <= height[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return result;
    }
}
