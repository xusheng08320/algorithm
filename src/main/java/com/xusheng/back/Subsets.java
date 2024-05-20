package com.xusheng.back;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    private List<Integer> t = new ArrayList<>();
    private List<List<Integer>> result = new ArrayList();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return result;
    }

    private void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            result.add(new ArrayList<>(t));
            return;
        }
        t.add(nums[cur]);
        dfs(cur + 1, nums);
        t.remove(t.size() - 1);
        dfs(cur + 1, nums);
    }
}
