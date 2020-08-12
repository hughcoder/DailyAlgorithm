package main.剑指offer第一轮刷题;

import java.util.LinkedList;
import java.util.Queue;

public class JZ39 {
    //输入一棵二叉树，判断该二叉树是否是平衡二叉树。
    //最优解 后序遍历 + 剪枝
    public boolean IsBalanced_Solution(TreeNode root) {

        if (root == null) {
            return false;
        }

        int maxLevel = 0;
        int minLevel = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.peek() != null) {
            maxLevel++;
            if(maxLevel -minLevel>1){
                return false;
            }
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                if (root.left != null) {
                    queue.add(root.left);
                }

                if (root.right != null) {
                    queue.add(root.right);
                }

                //最小深度
                if (root.left == null && root.right == null) {
                    minLevel = maxLevel;
                }
            }
        }

        return maxLevel - minLevel <= 1;

    }
}
