package main.剑指offer.第三阶段刷题;

import java.util.LinkedList;
import java.util.Queue;

public class JZ55 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //非递归
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int curSize = queue.size();
            level++;
            for (int i = 0; i < curSize; i++) {
                TreeNode curNode = queue.poll();
                if (curNode.left != null) {
                    queue.add(curNode.left);
                }
                if (curNode.right != null) {
                    queue.add(curNode.right);
                }
            }
        }
        return level;
    }
}
