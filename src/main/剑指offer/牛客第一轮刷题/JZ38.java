package main.剑指offer.牛客第一轮刷题;

import java.util.LinkedList;
import java.util.Queue;

public class JZ38 {

    public int TreeDepth(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList();
        int level = 0;
        queue.add(root);
        while (queue.peek() != null) {
            level++;
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                TreeNode node = queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                }

                if(node.right!=null){
                    queue.add(node.right);
                }

            }
        }

        return level;

    }
}
