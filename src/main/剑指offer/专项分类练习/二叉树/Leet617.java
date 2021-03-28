package main.剑指offer.专项分类练习.二叉树;

import main.剑指offer.专项分类练习.TreeNode;

public class Leet617 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return null;
        }
        if(root1 == null){
            return root2;
        }
        if(root2 == null){
            return root1;
        }
        TreeNode cur = new TreeNode(root1.val+root2.val);
        cur.left = mergeTrees(root1.left,root2.left);
        cur.right = mergeTrees(root1.right,root2.right);
        return cur;
    }
}
