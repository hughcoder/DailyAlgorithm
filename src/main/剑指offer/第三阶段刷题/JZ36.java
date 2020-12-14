package main.剑指offer.第三阶段刷题;


public class JZ36 {
    //输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。

    //解题思路 左根右 中序遍历
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
    // 记录第一个
    Node head;
    Node pre; // 记录上一个节点
    public Node treeToDoublyList(Node root) {
        if(root == null){ //判空注意
            return null;
        }
        recur(root);
        //这里遍历到最后一个节点
        pre.right = head;
        head.left = pre; // 这里要注意使用 pre 上一节点 当前root为null
        return head;
    }
    //左根右
    public void recur(Node root){
        if(root == null){
            return;
        }
        recur(root.left);
        if(pre!=null){
            pre.right = root;
        }else {
            //如果为空 说明是第一个节点
            head = root;
        }
        root.left = pre;
        pre = root;
        recur(root.right);
    }
    public static void main(String args[]) {
        Node Node = new Node(4);
        Node left = new Node(2);
        left.left = new Node(1);
        left.right = new Node(3);
        Node right = new Node(5);
        Node.left = left;
        Node.right = right;
        JZ36 jz26 = new JZ36();
        Node node = jz26.treeToDoublyList(Node);


    }
}
