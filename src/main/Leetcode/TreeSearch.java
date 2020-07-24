package main.Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSearch {


    public static void bfsTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null)
            queue.add(root);//到这里为步骤 1
        System.out.println("root val----->" + root.val);
        while (!queue.isEmpty()) {//重复步骤 2
            root = queue.poll();
            if (root.left != null)
                System.out.println("left val----->" + root.left.val);
                queue.add(root.left);

            if (root.right != null)
                System.out.println("right val----->" + root.right.val);
                queue.add(root.right);

        }
    }


    public static void main(String args[]) {
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
    }

}
