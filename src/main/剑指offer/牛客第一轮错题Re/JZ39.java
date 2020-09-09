package main.剑指offer.牛客第一轮错题Re;

import java.util.LinkedList;
import java.util.Queue;

//计算深度用前序遍历 先遍历根  关键是用前序遍历如何计算二叉树的深度
public class JZ39 {
    //不能通过计算最小深度和最大深度
    // 1
    //  2
    //    3
    //类似这种单边的最小最大深度都是一致的
    //换种思路 去遍历二叉树 dfs
    // 平衡性不超过1
    private boolean mIs = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        TreeDepth(root);
        return mIs;
    }

    private int TreeDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = TreeDepth(node.left);
        int right = TreeDepth(node.right);

        if (Math.abs(left - right) > 1) {
            mIs = false;
        }

        return Math.max(left, right) + 1;

    }

    private void PreOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode lf1 = new TreeNode(2);
        TreeNode lf2 = new TreeNode(4);
        TreeNode lf3 = new TreeNode(5);
        node.right = new TreeNode(3);
        node.left = lf1;
        lf1.left = lf2;
        lf2.left = lf3;
        JZ39 jz39 = new JZ39();
        System.out.println(jz39.IsBalanced_Solution(node));
    }
}
