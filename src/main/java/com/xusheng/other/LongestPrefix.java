package com.xusheng.other;

import org.junit.Test;

public class LongestPrefix {

    @Test
    public void test() {
        String str1 = "abcd";
        String str2 = "a";
        String str3 = "ab";

        String[] strs = new String[3];
        strs[0] = str1;
        strs[1] = str2;
        strs[2] = str3;
        System.out.println(longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

}
