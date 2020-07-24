package main.Leetcode.day3;

import main.二叉树.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//给定一个二叉树，找出其最大深度。
//
//二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
public class Leet104 {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return 0;
        }
        int level = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            level++;
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
        }
        return level;
    }
}
