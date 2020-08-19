package main.剑指offer第一轮刷题;

import java.util.ArrayList;

public class JZ62 {
    //给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，
    // 按结点数值大小顺序第三小结点的值为4。  左<根<右
    // k的大小和pRoot的大小判断

    TreeNode KthNode(TreeNode pRoot, int k) {
        ArrayList<TreeNode> arrayList = new ArrayList<>();
        if (pRoot == null || k == 0) {
            return null;
        }

        inOrder(pRoot, arrayList);
        if (arrayList.size() < k) {
            return null;
        }

        return arrayList.get(k - 1);
    }

    //中序遍历 得到的是一个递增序列

    private void inOrder(TreeNode node, ArrayList<TreeNode> list) {
        if (node == null) {
            return;
        }

        inOrder(node.left, list);
        list.add(node);
        inOrder(node.right, list);

    }

    public static void main(String args[]) {
        JZ62 jz62 = new JZ62();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        jz62.KthNode(node, 3);
    }
}
