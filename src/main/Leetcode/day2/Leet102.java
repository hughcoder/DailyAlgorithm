package main.Leetcode.day2;

//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。

import main.二叉树.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//BFS 广度优先遍历
//DFS 深度优先遍历
public class Leet102 {

    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> treeList = new ArrayList<>();
        List<Integer> singleList = new ArrayList<>();

        if(root == null){
            return treeList;
        }

        queue.add(root);
        singleList.add(root.val);
        treeList.add(singleList);
        while (!queue.isEmpty()) {
            singleList = new ArrayList<>();
            int currentCount = queue.size();
            for (int i = 0; i < currentCount; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    singleList.add(node.left.val);
                    queue.add(node.left);
                }
                if (node.right != null) {
                    singleList.add(node.right.val);
                    queue.add(node.right);
                }
            }
            if (!singleList.isEmpty()) {
                treeList.add(singleList);
            }
        }

        return treeList;

    }


}
