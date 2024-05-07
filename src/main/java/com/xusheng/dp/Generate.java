package com.xusheng.dp;

import java.util.LinkedList;
import java.util.List;

public class Generate {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> subResult = new LinkedList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    subResult.add(1);
                    continue;
                }
                int num = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                subResult.add(num);
            }
            result.add(subResult);
        }
        return result;
    }
}
