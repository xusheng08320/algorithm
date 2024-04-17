package com.xusheng.dp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

    @Test
    public void test() {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(wordBreak(s, wordDict));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        for (String str : wordDict) {
            s = s.replaceAll(str, "");
        }
        return s.length() == 0;
    }
}
