package main.剑指offer.第三阶段刷题;

public class JZ55_2 {

    //输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，
    // 那么它就是一棵平衡二叉树。
    //方法一：后序遍历 + 剪枝 （从底至顶）
    //思路是对二叉树做后序遍历，从底至顶返回子树深度，若判定某子树不是平衡树则 “剪枝” ，直接向上返回。
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    //后序遍历 左右根
    private int recur(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = recur(root.left);
        if (left == -1) {
            return -1;
        }
        int right = recur(root.right);
        if (right == -1) {
            return -1;
        }

        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1 ;//当前节点的深度等于左右子节点最大值+1

    }
}
