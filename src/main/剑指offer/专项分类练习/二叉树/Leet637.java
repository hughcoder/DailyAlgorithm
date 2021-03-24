package main.剑指offer.专项分类练习.二叉树;

import main.剑指offer.专项分类练习.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
public class Leet637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            double curSize = queue.size();
            double sum = 0;
            for (int i = 0; i < curSize; i++) {
                TreeNode cur = queue.poll();
                if (cur != null) {
                    sum += cur.val;
                    if (cur.left != null) {
                        queue.add(cur.left);
                    }
                    if (cur.right != null) {
                        queue.add(cur.right);
                    }
                }

            }
            list.add( sum / curSize);
        }

        return list;

    }


}
