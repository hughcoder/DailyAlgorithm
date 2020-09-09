package main.剑指offer.牛客第一轮错题Re;

public class JZ62 {
    TreeNode cur;
    //第k小
    int curLevel = 1;

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null) {
            return null;
        }
        preOrder(pRoot, k);
        return cur;
    }

    private void preOrder(TreeNode node, int k) {
        if (node == null) {
            return;
        }

        preOrder(node.left, k);
        if (curLevel == k) {
            cur = node;
        }
        curLevel++;
        preOrder(node.right, k);
    }


}
