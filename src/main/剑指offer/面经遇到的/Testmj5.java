package main.剑指offer.面经遇到的;

//二叉树最长结点集合
//https://leetcode-cn.com/problems/diameter-of-binary-tree/
public class Testmj5 {
    //实际转化为左边和右边的层数
    int maxed = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxed;
    }

    public int depth(TreeNode cur) {
        if (cur == null) {
            return 0;
        }
        int left = depth(cur.left);
        int right = depth(cur.right);
        maxed = Math.max(left + right, maxed);
        return Math.max(left, right) + 1;
    }
}
