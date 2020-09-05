package main.剑指offer.牛客第一轮刷题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JZ60 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot == null) {
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> allList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        int level = 0;
        while (!queue.isEmpty()) {
            level++;
            int currentSize = queue.size();
            ArrayList<Integer> singleList = new ArrayList<>();
            for (int i = 0; i < currentSize; i++) {
                TreeNode a = queue.poll();
                if (a != null) {
                    singleList.add(a.val);
                }
                if (a.left != null) {
                    queue.add(a.left);
                }

                if (a.right != null) {
                    queue.add(a.right);
                }
            }
            allList.add(new ArrayList<>(singleList));
            singleList.clear();
        }

        return allList;
    }
}
