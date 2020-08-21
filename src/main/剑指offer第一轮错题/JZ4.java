package main.剑指offer第一轮错题;

public class JZ4 {
    //如何每次循环 构造左右各自的前序、中序数组
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }

        TreeNode treeNode = new TreeNode(pre[0]);
        int index = 0;
        for (int i = 0; i < in.length; i++) { // 先找到
            if (pre[0] == in[i]) {
                index = i;
            }
        }
        int[] leftIn = new int[index];
        int[] rightIn = new int[in.length - index - 1];
        int[] leftPre = new int[index];
        int[] rightPre = new int[in.length - index - 1];
        for (int i = 0; i < in.length; i++) {
            if (i < index) {
                leftIn[i] = in[i];
            } else if (i > index) {
                rightIn[i-index-1] = in[i];
            }

            if (i > 0 && i <= index) {
                leftPre[i-1] = pre[i];
            } else if (i > index) {
                rightPre[i-index-1] = pre[i];
            }
        }

        treeNode.left = reConstructBinaryTree(leftPre, leftIn);
        treeNode.right = reConstructBinaryTree(rightPre, rightIn);

        return treeNode;
    }

    public static void main(String args[]) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        JZ4 jz4 = new JZ4();
        jz4.reConstructBinaryTree(pre, in);

    }

}
