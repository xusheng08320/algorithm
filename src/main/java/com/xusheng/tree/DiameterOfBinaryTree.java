package com.xusheng.tree;

import org.junit.Test;

public class DiameterOfBinaryTree {

    @Test
    public void test() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.right = node2;
        node2.right = node3;
        node3.right = node4;
        node4.right = node5;
        System.out.println(diameterOfBinaryTree(node1));
    }

    int result;
    public int diameterOfBinaryTree(TreeNode root) {
        result = 1;
        recursive(root);
        return result - 1;
    }

    public int recursive(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = recursive(node.left);
        int right = recursive(node.right);
        result = Math.max(result, left + right + 1);
        return Math.max(left, right) + 1;
    }
}
