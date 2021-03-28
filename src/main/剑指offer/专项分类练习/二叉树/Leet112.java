package main.剑指offer.专项分类练习.二叉树;

import main.剑指offer.专项分类练习.TreeNode;

public class Leet112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null&& root.val == targetSum){//后续一减就对了
            return true;
        }
        return hasPathSum(root.left,targetSum - root.val)||hasPathSum(root.right,targetSum - root.val);
    }

}
