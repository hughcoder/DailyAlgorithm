package main.剑指offer.专项分类练习.二叉树;

import main.剑指offer.专项分类练习.TreeNode;

public class Leet101 {
    public boolean isSymmetric(TreeNode root) {
       if(root == null){
           return true;
       }
       return dfs(root.left,root.right);
    }

    public boolean dfs(TreeNode left,TreeNode right){
        if(left==null&right ==null){
            //遍历到结束位置
            return true;
        }
        if(left ==null||right==null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return dfs(left.left,right.right)&&dfs(left.right,right.left);
    }
}
