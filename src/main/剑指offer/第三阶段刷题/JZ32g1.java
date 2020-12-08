package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JZ32g1 {
    //要求递归和非递归两种方式实现

    public int[] levelOrder2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return new int[0];
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int curSize = queue.size();
            for (int i = 0; i < curSize; i++) {
                TreeNode cur = queue.poll();
                if (cur != null) {
                    list.add(cur.val);
                    if (cur.left != null) {
                        queue.add(cur.left);
                    }
                    if (cur.right != null) {
                        queue.add(cur.right);
                    }
                }
            }
        }

        int[] a = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            a[k] = list.get(k);
        }

        return a;
    }


}
