package main.Leetcode.day3;


//给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
//
//百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
//
//例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]

import main.Leetcode.TreeNode;

public class Leet235 {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null ) {
            return root;
        }

        if(root == p || root == q){
            System.out.println("root--->"+root.val);
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(5);
        TreeNode a = new TreeNode(1);
        treeNode.left = a;
        TreeNode noder = new TreeNode(4);
        TreeNode c = new TreeNode(3);
        noder.left = c;
        TreeNode b = new TreeNode(6);
        noder.right = b;
        treeNode.right = noder;
        System.out.println("val--->"+ lowestCommonAncestor(treeNode,b,c).val);


    }
}
