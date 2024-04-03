package com.xusheng.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        print(root, result);
        return result;
    }

    public void print(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        print(node.left, result);
        result.add(node.val);
        print(node.right, result);
    }
}
