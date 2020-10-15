package main.剑指offer.leetcode极客第二轮;


//98. 验证二叉搜索树
public class Leete98 {
    //中序遍历节点 从小到大

    TreeNode pre;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            //遍历到最后
            return true;
        }

        if (!isValidBST(root.left)) {
            return false;
        }
        if (pre != null) {
            if (root.val <= pre.val) {
                return false;
            }
        }
        System.out.println("--->"+root.val);
        pre = root;
        return isValidBST(root.right);

    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(2);
        TreeNode a = new TreeNode(1);
        treeNode.left = a;
        TreeNode noder = new TreeNode(4);
        TreeNode c = new TreeNode(3);
        noder.left = c;
        TreeNode b = new TreeNode(6);
        noder.right = b;
        treeNode.right = noder;
        Leete98 leete98 = new Leete98();
        System.out.println("val--->"+ leete98.isValidBST(treeNode));

    }


}
