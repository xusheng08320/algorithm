package com.xusheng.tree;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        return md(root);
    }

    public int md(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(md(node.left) + 1, md(node.right) + 1);
    }
}
