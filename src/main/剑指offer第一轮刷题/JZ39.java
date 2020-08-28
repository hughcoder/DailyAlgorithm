package main.剑指offer第一轮刷题;

import main.数组.ZJ29;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JZ39 {
    //输入一棵二叉树，判断该二叉树是否是平衡二叉树。
    //如果某二叉树中任意节点的左右子树的深度相差不超过1，
    //最优解 后序遍历 + 剪枝
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        if (left == -1) {
            return -1;
        }
        int right = dfs(root.right);
        if (right == -1) {
            return -1;
        }
        System.out.println(root.val + "每层节点---->" + (Math.abs(right - left) < 2 ? Math.max(left, right) + 1 : -1));
        return Math.abs(right - left) < 2 ? Math.max(left, right) + 1 : -1;
    }

    public static void main(String args[]) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        TreeNode right = new TreeNode(2);
        right.left = new TreeNode(1);
        right.right = new TreeNode(7);
        node.right = right;
        JZ39 jz39 = new JZ39();
        jz39.isBalanced(node);
    }
}
