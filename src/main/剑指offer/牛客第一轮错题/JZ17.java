package main.剑指offer.牛客第一轮错题;

public class JZ17 {
    //输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
//https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/solution/mian-shi-ti-26-shu-de-zi-jie-gou-xian-xu-bian-li-p/

    //判断是子结构需要两步骤：
    // 1。调用函数 HasSubtree(A,B)遍历树A,
    // 2。调用递归函数recur(A,B),判定树A包含树b

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return recur(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
        //这里不能想成链表，每次HasSubtree 的root2都是完整的子树
    }

    private boolean recur(TreeNode root1, TreeNode roo2) {
        if (roo2 == null) {
            return true;
        }

        if (root1 == null || root1.val != roo2.val) {
            return false;
        }

        return recur(root1.left, roo2.left) && recur(root1.right, roo2.right);
    }

    public static void main(String args[]) {
        JZ17 jz17 = new JZ17();
        TreeNode root = new TreeNode(3);
        TreeNode left1 = new TreeNode(4);
        root.left = left1;
        TreeNode left2 = new TreeNode(4);
        left1.left = left2;
        left2.left = new TreeNode(1);
        root.right = new TreeNode(5);

        TreeNode sub = new TreeNode(4);
        sub.left = new TreeNode(1);
        System.out.println(jz17.HasSubtree(root, sub));


    }
}
