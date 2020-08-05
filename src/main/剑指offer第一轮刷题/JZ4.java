package main.剑指offer第一轮刷题;

public class JZ4 {

    //例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length != in.length || pre.length == 0)
            return null;
        //每次循环先确认根结点
        TreeNode root = new TreeNode(pre[0]);
        int len = pre.length;
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                index = i;
                break;
            }
        }
        System.out.println("index---->" + index);
        int[] leftIn = new int[index];
        int[] rightIn = new int[len - index-1];//第一个错这边边界错了
        int[] leftPre = new int[index];
        int[] rightPre = new int[len - index-1];// 用一个循环可以完成 因为in和pre长度一致

        for (int i = 0; i < in.length; i++) {
            if (i < index) {
                leftIn[i] = in[i];
                leftPre[i] = pre[i + 1];
            } else if (i > index) {
                rightIn[i - index - 1] = in[i];
                rightPre[i - index - 1] = pre[i];
            }
        }

        root.left = reConstructBinaryTree(leftPre, leftIn);
        root.right = reConstructBinaryTree(rightPre, rightIn);

        return root;

    }

    public static void main(String args[]) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};

        reConstructBinaryTree(pre, in);

    }

}
