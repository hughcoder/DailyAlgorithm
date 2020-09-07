package main.剑指offer.牛客第一轮错题Re;

public class JZ26 {
    //    输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。

    TreeNode pre, head;

    public TreeNode Convert(TreeNode pRootOfTree) {
        inOrder(pRootOfTree);
        return head;
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        if (pre != null) {
            pre.right = root;
            root.left = pre;
        } else {
            head = root; //记录第一个开始遍历的节点
        }
        pre = root;
        inOrder(root.right);
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
