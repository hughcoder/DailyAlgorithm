package main.剑指offer.牛客第一轮错题Re;

import java.util.LinkedList;
import java.util.Queue;

public class JZ39 {
    //不能通过计算最小深度和最大深度
    // 1
    //  2
    //    3
    //类似这种单边的最小最大深度都是一致的
    //换种思路 去遍历二叉树 dfs
    // 平衡性不超过1
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        return false;
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
