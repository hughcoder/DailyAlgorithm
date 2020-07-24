package main.Leetcode.day3;

//给定一个二叉树，找出其最小深度。
//
//最小深度是从根节点到最近叶子节点的最短路径上的节点数量。

//和104类似  2种写法 bfs 和dfs

import main.二叉树.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leet111 {

    public int minDepth(TreeNode root) {
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
                if (node.left == null && node.right == null) {
                    return level;
                }

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return level;
    }

}
