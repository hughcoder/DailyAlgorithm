package main.剑指offer.专项分类练习.二叉树;

import main.剑指offer.专项分类练习.TreeNode;

public class Leet543 {
    //给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。
    // 这条路径可能穿过也可能不穿过根结点。

    private int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = dfs(root.left);
        int right =dfs(root.right);
        max = Math.max(left+right,max);
        return Math.max(left,right)+1;
    }
}
