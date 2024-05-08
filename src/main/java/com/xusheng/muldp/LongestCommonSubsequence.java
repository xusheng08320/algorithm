package com.xusheng.muldp;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        char[] char1 = text1.toCharArray();
        char[] char2 = text2.toCharArray();
        int[][] dp = new int[char1.length + 1][char2.length + 1];
        for (int i = 1; i <= char1.length; i++) {
            char ch1 = char1[i - 1];
            for (int j = 1; j <= char2.length; j++) {
                char ch2 = char2[j - 1];
                if (ch2 == ch1) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[char1.length][char2.length];
    }
}
