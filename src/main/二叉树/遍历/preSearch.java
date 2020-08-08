package main.二叉树.遍历;

import main.二叉树.TreeNode;

import java.util.ArrayList;

public class preSearch {

    static ArrayList<Integer> arrayList = new ArrayList();

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        arrayList.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        TreeNode right = new TreeNode(3);
        treeNode.left = left;
        treeNode.right = right;
        preOrder(treeNode);

        for (int x : arrayList) {
            System.out.println("--->" + x);
        }
    }
}
