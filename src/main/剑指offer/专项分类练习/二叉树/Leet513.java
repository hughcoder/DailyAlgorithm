package main.剑指offer.专项分类练习.二叉树;

import main.剑指offer.专项分类练习.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leet513 {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int curSize = queue.size();
            for (int i = 0; i < curSize; i++) {
                TreeNode cur = queue.poll();
                if (cur != null) {
                    if (i == 0) {
                        list.add(cur.val);
                    }
                    if (cur.left != null) {
                        queue.add(cur.left);
                    }

                    if (cur.right != null) {
                        queue.add(cur.right);
                    }
                }
            }
        }
        return list.get(list.size() - 1);

    }
}
