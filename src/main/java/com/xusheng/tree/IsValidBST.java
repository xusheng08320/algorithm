package com.xusheng.tree;

public class IsValidBST {

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValid(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }
        if (node.val >= upper || node.val <= lower) {
            return false;
        }
        boolean left = isValid(node.left, lower, node.val);
        boolean right = isValid(node.right, node.val, upper);
        return left && right;
    }
}
