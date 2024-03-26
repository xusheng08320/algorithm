package com.xusheng.other;

import org.junit.Test;

public class Trap {

    @Test
    public void testTrap() {
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }

    public int trap(int[] height) {
        int len = height.length;
        if (len == 0) {
            return 0;
        }
        int[] left = new int[len];
        left[0] = height[0];
        for (int i = 1; i < len; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        int[] right = new int[len];
        right[len - 1] = height[len - 1];
        for (int i = len - 2; i >= 0 ; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        int result = 0;
        for (int i = 0; i < len; i++) {
            result += Math.min(left[i], right[i]) - height[i];
        }
        return result;
    }
}
