package main.剑指offer.牛客第一轮刷题;

//输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
public class JZ26 {

    TreeNode pre, head;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
//        head = pRootOfTree;
        inOrder(pRootOfTree);
        pre.right = head;
        head.left = pre;
        return head;
    }

    public void inOrder(TreeNode cur) {  //中序遍历

        if (cur == null) {
            return;
        }
        inOrder(cur.left);
        if (pre != null) {
            pre.right = cur;
        } else {
            head = cur;//记录头节点
        }
        cur.left = pre;
        pre = cur;
        System.out.println(cur.val); // 根
        inOrder(cur.right);

    }

    //数组尝试下

    public static void main(String args[]) {
        TreeNode treeNode = new TreeNode(4);
        TreeNode left = new TreeNode(2);
        left.left = new TreeNode(1);
        left.right = new TreeNode(3);
        TreeNode right = new TreeNode(5);
        treeNode.left = left;
        treeNode.right = right;
        JZ26 jz26 = new JZ26();
        TreeNode node = jz26.Convert(treeNode);


    }
}
