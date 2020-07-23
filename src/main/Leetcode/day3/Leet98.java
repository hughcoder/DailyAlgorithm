package main.Leetcode.day3;

import main.Leetcode.TreeNode;

import java.util.ArrayList;

//假设一个二叉搜索树具有如下特征：
//
//节点的左子树只包含小于当前节点的数。
//节点的右子树只包含大于当前节点的数。
//所有左子树和右子树自身必须也是二叉搜索树

//中顺遍历 左根右
//O(n)

public class Leet98 {

    private static ArrayList<Integer> arrayList = new ArrayList<>();

    public static boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        inOrder(root);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) <= arrayList.get(i - 1)) { //升序 不取到等于
                return false;
            }
        }
        return true;
    }

    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        arrayList.add(root.val);
        inOrder(root.right);
    }



    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(1);
        TreeNode noder = new TreeNode(4);
        noder.left = new TreeNode(3);
        noder.right = new TreeNode(6);
        treeNode.right = noder;
        System.out.println(isValidBST(treeNode));

        for (int x : arrayList) {
            System.out.println("x----->" + x);
        }
    }


}
