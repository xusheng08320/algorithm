package com.xusheng.dp;

import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;

public class CanPartition {
    @Test
    public void test() {
        int num[] = {1,5,11,5};
        canPartition(num);
    }

    public boolean canPartition(int[] nums) {
        if (nums.length == 1) {
            return false;
        }
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        if (total % 2 != 0) {
            return false;
        }
        int target = total / 2;
        boolean[][] dp = new boolean[nums.length][target + 1];
        if (nums[0] < target) {
            dp[0][nums[0]] = true;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];
                if (nums[i] == j) {
                    dp[i][j] = true;
                    continue;
                }
                if (nums[i] < j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= target; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[nums.length - 1][target];
    }

}
