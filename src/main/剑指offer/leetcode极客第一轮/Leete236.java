package main.剑指offer.leetcode极客第一轮;

public class Leete236 {
    //最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先
// 且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.val == p.val || root.val == q.val) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        //同时为空 或者同时不为空（说明left和right在root的左右） 都返回root
        return root;
    }

    public static void main(String args[]) {
        Leete236 leete235 = new Leete236();
        TreeNode node = new TreeNode(6);
        node.left = new TreeNode(2);
        TreeNode right = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        right.left = node7;
        right.right = node9;
        node.right = right;
        leete235.lowestCommonAncestor(node, node7, node9);
    }
}
