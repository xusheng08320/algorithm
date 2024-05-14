package com.xusheng.tree;

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        return recursive(nums, 0, nums.length - 1);
    }

    private TreeNode recursive(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = recursive(nums, left, mid - 1);
        node.right = recursive(nums, mid + 1, right);
        return node;
    }
}
