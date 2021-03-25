package main.剑指offer.专项分类练习.二叉树;

import main.剑指offer.专项分类练习.TreeNode;

public class Leet226 {
    public TreeNode invertTree(TreeNode root) {
        dfs(root);
        return root;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        dfs(root.left);
        dfs(root.right);
    }
}
