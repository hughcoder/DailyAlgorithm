package main.二叉树;

//输入一棵二叉树，判断该二叉树是否是平衡二叉树。

//平衡二叉树定义(AVL)：它或者是一颗空树，或者具有以下性质的二叉排序树：它的左子树和右子树的深度之差(平衡因子)的绝对值不超过1，且它的左子树和右子树都是一颗平衡二叉树。
//
//一棵AVL树有如下必要条件：
//
// 条件一：它必须是二叉查找树。
//条件二：每个节点的左子树和右子树的高度差至多为1。

import java.util.ArrayList;

public class Binary12 {

    public static boolean IsBalanced_Solution(TreeNode root) {
        if(root == null){
            return true;
        }

        TreeNode root2 = root;
        int leftIndex = 0;
        int rightIndex = 0;

        while (root.left != null) {
            if (root.val < root.left.val) {
                return false;
            }
            root = root.left;
            leftIndex++;
        }
        while (root2.right != null) {
            if (root2.val > root2.right.val) {
                return false;
            }
            root2 = root2.right;
            rightIndex++;
        }

        if (getNum(leftIndex - rightIndex) > 1) {
            return false;
        }
        return true;
    }

    public static int getNum(int a) {
        return a > 0 ? a : -a;
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(4);
        TreeNode left = new TreeNode(3);
        left.left = new TreeNode(2);
        left.left.left =new TreeNode(1);
        TreeNode right = new TreeNode(5);
        right.right=new TreeNode(6);
        right.right.right = new TreeNode(7);
        treeNode.left = left;
        treeNode.right = right;

        System.out.println(IsBalanced_Solution(treeNode));
    }
}
