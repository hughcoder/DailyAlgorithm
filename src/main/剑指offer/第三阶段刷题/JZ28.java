package main.剑指offer.第三阶段刷题;

public class JZ28 {
    //请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的
    //对称二叉树定义
    //1.当前两对称节点值相等
    //2.L.left = R.right ,L的左子节点和R的右子节点 堆成
    //3.L.right = R.left ,L的右子节点和R的左子节点 堆成
    //考虑从顶至底递归，判断每对节点是否对称，从而判断树是否为对称二叉树
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return recur(root.left, root.right);
    }

    public boolean recur(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }
        return recur(left.left, right.right) && recur(left.right, right.left);
    }
}
