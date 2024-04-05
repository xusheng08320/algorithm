package com.xusheng.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrder {

    @Test
    public void testLevelOrder() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        System.out.println(levelOrder(root));
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Integer level = 0;
        recursiveLevelOrder(root, result, level);
        return result;
    }

    private void recursiveLevelOrder(TreeNode node, List<List<Integer>> result, Integer level) {
        if (node == null) {
            return;
        }
        if (level >= result.size()) {
            result.add(level, new LinkedList<>());
        }
        List<Integer> list = result.get(level);
        list.add(node.val);
        recursiveLevelOrder(node.left, result, level + 1);
        recursiveLevelOrder(node.right, result, level + 1);
    }
}
