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
                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }

            }
        }

        return level;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode lf1 = new TreeNode(2);
        TreeNode lf2 = new TreeNode(4);
        TreeNode lf3 = new TreeNode(5);
        node.right = new TreeNode(3);
        node.left = lf1;
        lf1.left = lf2;
        lf2.left = lf3;
        JZ38 jz39 = new JZ38();
        System.out.println(jz39.TreeDepth(node));
    }
}
