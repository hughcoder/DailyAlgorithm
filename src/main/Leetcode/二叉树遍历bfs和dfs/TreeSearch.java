package main.Leetcode.二叉树遍历bfs和dfs;

import main.Leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeSearch {


    public static void bfsTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null)
            queue.add(root);//到这里为步骤 1
        System.out.println("root val----->" + root.val);
        while (!queue.isEmpty()) {//重复步骤 2
            root = queue.poll();
            if (root != null) {
                if (root.left != null)
                    System.out.println("left val----->" + root.left.val);
                queue.add(root.left);

                if (root.right != null)
                    System.out.println("right val----->" + root.right.val);
                queue.add(root.right);
            }

        }
    }


    public static void dfsTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root != null)
            stack.push(root);//到这里为步骤 1
        System.out.println("root val----->" + root.val);
        while (!stack.isEmpty()) {//重复步骤 2
            root = stack.pop();
            if (root != null) {
                if (root.left != null) {
                    System.out.println("left val----->" + root.left.val);
                    stack.push(root.left);
                }
                if (root.right != null) {
                    System.out.println("right val----->" + root.right.val);
                    stack.push(root.right);
                }

            }

        }
    }

    public static void DFSWithRecursion(TreeNode root) {
        if (root == null)
            return;
        System.out.println("val--->" + root.val);
        if (root.left != null)
//            System.out.println("val--->" + root.left.val);
            DFSWithRecursion(root.left);
        if (root.right != null)
//            System.out.println("val--->" + root.right.val);
            DFSWithRecursion(root.right);
    }



    public static void main(String args[]) {
        // 例子二叉树
        //    5
        //  1   4
        //2  7 3  6
        TreeNode treeNode = new TreeNode(5);
        TreeNode child1 = new TreeNode(1);
        child1.left = new TreeNode(2);
        child1.right = new TreeNode(7);
        treeNode.left = child1;
//        treeNode.left = new TreeNode(1);
        TreeNode noder = new TreeNode(4);
        noder.left = new TreeNode(3);
        noder.right = new TreeNode(6);
        treeNode.right = noder;

        bfsTree(treeNode);
        System.out.println("------------------");
        dfsTree(treeNode);
        System.out.println("------------------");
        DFSWithRecursion(treeNode);
    }

}
