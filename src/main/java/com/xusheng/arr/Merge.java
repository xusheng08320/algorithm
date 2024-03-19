package com.xusheng.arr;

import org.junit.Test;
import org.junit.experimental.max.MaxHistory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {

    @Test
    public void testMerge() {
        int arr[][] = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merge = merge(arr);
        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i][0] + "," + merge[i][1]);
        }
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        List<int[]> merged = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < left) {
                merged.add(new int[]{left, right});
                continue;
            }
            merged.get(merged.size() - 1)[1] = Math.max(right, merged.get(merged.size() - 1)[1]);
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
