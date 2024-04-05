package com.xusheng.tree;

public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode == null || rightNode == null) {
            return false;
        }
        return (leftNode.val == rightNode.val) && isSymmetric(leftNode.left, rightNode.right) && isSymmetric(rightNode.left, leftNode.right);
    }
}
