package main.剑指offer.leetcode极客第二轮;


public class Leete235 {

    //二叉搜索树 从小到大 找到第一个指在pq之间
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        return root;

    }

}





