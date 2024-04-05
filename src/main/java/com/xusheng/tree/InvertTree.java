package com.xusheng.tree;

public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        return recursiveGetNode(root);
    }

    private TreeNode recursiveGetNode(TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode leftNode = recursiveGetNode(node.left);
        TreeNode rightNode = recursiveGetNode(node.right);
        node.left = rightNode;
        node.right = leftNode;
        return node;
    }

}
