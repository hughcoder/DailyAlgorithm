package main.剑指offer.牛客第一轮错题;

//输入一棵二叉树，判断该二叉树是否是平衡二叉树。
//
//在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树


public class JZ39 {
    public boolean IsBalanced_Solution(TreeNode root) {
        return laterOrder(root) != -1;
    }

    private int laterOrder(TreeNode node) {
        if (node == null) {
            return 0; // null 重0开始
        }

        int left = laterOrder(node.left);
        if (left == -1) {
            return -1;
        }
        int right = laterOrder(node.right);
        if (right == -1) {
            return -1;
        }

        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
    }
}
