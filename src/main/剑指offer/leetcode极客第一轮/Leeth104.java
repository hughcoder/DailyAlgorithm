package main.剑指offer.leetcode极客第一轮;

import java.util.LinkedList;
import java.util.Queue;

//对应ppt13广度优先深度优先 bfs 和 dfs
public class Leeth104 {
    //给定一个二叉树，找出其最大深度。
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int currentSize = queue.size();
            level++;
            for (int i = 0; i < currentSize; i++) {
                TreeNode cur = queue.poll();
                if (cur != null) {
                    if (cur.left != null) {
                        queue.add(cur.left);
                    }
                    if (cur.right != null) {
                        queue.add(cur.right);
                    }
                }

            }
        }
        return level;
    }
}
