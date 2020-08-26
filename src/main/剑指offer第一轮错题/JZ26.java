package main.剑指offer第一轮错题;

import main.剑指offer第一轮刷题.ListNode;

public class JZ26 {
    //输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。

    TreeNode pre, head; // 且从head返回 pre指向上一个节点

    public TreeNode Convert(TreeNode pRootOfTree) {
        inOrder(pRootOfTree);
        System.out.println("---->+"+pRootOfTree.val);
        return head;
    }

    private void inOrder(TreeNode cur) {
        if (cur == null) {
            return;
        }
        inOrder(cur.left);
        //当前节点更改左右的指向
        if (pre != null) {
            pre.right = cur;
            cur.left = pre;
        } else {
            head = cur;//记录头节点
        }
        pre = cur;
        inOrder(cur.right);
    }

    public static void main(String args[]) {
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(1);
        node.right = new TreeNode(3);

        JZ26 jz26 = new JZ26();
        TreeNode list = jz26.Convert(node);
        System.out.println("---->zz"+list.val);

    }
}
