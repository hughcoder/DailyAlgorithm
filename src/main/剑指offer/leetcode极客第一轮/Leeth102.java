package main.剑指offer.leetcode极客第一轮;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//对应ppt13广度优先深度优先 bfs 和 dfs
public class Leeth102 {
    // BFS
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> singleList;
        queue.add(root);
        while (!queue.isEmpty()) {
            int curSize = queue.size();
            singleList = new ArrayList<>();
            for (int i = 0; i < curSize; i++) {
                TreeNode cur = queue.poll();
                if (cur != null) {
                    singleList.add(cur.val);
                    if (cur.left != null) {
                        queue.add(cur.left);
                    }
                    if (cur.right != null) {
                        queue.add(cur.right);
                    }
                }
            }
            list.add(new ArrayList<>(singleList));
        }
        return list;
    }
}
