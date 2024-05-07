package com.xusheng.dp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class WordBreak {

    @Test
    public void test() {
        String s = "applepenapple";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        System.out.println(wordBreak(s, wordDict));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i && !dp[i]; j++) {
                String substring = s.substring(j, i);
                if (set.contains(substring) && dp[j]) {
                    dp[i] = true;
                }
            }
        }
        return dp[dp.length - 1];
    }

    public boolean wordBreak1(String s, List<String> wordDict) {
        for (String str : wordDict) {
            s = s.replaceAll(str, "");
        }
        return s.length() == 0;
    }
}
