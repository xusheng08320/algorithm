package com.xusheng.dp;

import java.util.LinkedList;
import java.util.List;

public class Generate {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new LinkedList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                    continue;
                }
                int cur = result.get(i - 1).get(j) + result.get(i - 1).get(j - 1);
                row.add(cur);
            }
            result.add(row);
        }
        return result;
    }
}
