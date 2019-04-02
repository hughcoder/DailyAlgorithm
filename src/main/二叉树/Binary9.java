package main.二叉树;


import java.util.ArrayList;

//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
//后序遍历 左右根  简单理解 先下面在上面  左右根
// 考察知识点 1：二叉搜索数概念 2.后序遍历
//二叉查找树（Binary Search Tree），（又：二叉搜索树，二叉排序树）它或者是一棵空树，或者是具有下列性质的二叉树： 若它的左子树不空，
// 则左子树上所有结点的值均小于它的根结点的值； 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值； 它的左、右子树也分别为二叉排序树。
//简单来说 二叉搜索树 对应每个节点 左<根<右   后序遍历 ：左右根  // 我们能确定最后的一个值是根节点
public class Binary9 {


    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null ||sequence.length ==0) {
            return false;
        }

        return VerifyBST(sequence, 0, sequence.length - 1);
    }

    public static boolean VerifyBST(int[] sequence, int start, int end) {

        if (start >= end) {   //能走完完整的遍历则说明该数组符合二叉排序树的定义
            return true;
        }

        int index = start; // 记录每一个开始的点

//   若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值 条件1  //先从左->右 找到第一个大于根的节点
        while (index < end && sequence[index] < sequence[end]) {
            index++;
        }

        if (index > end ) {
            return false;
        }
        int leftRoot = index;
        System.out.println("leftRoot -------"+leftRoot);
        // 上面A条件 左子树均小于end满足 还要满足b条件 右字数俊大于根节点
        for(int i = leftRoot;i<end-1;i++){
            if(sequence[i]<sequence[end]){
                return false;
            }
        }

        return VerifyBST(sequence, 0, leftRoot-1) && VerifyBST(sequence, leftRoot, end - 1);

    }

    public static void main(String args[]) {
//        TreeNode treeNode = new TreeNode(6);
//        TreeNode treeNodeleft = new TreeNode(6);
//        treeNodeleft.left = new TreeNode(4);
//        treeNodeleft.right = new TreeNode(8);
//        treeNode.left = treeNodeleft;
//        TreeNode treeNodeRight = new TreeNode(14);
//        treeNodeRight.left = new TreeNode(12);
//        treeNodeRight.right = new TreeNode(16);
//        treeNode.right = treeNodeRight;

        int a[] = {4, 8, 6, 12, 16, 14, 10};

        System.out.println(VerifySquenceOfBST(a));

//        for (int i = 0; i < print.size(); i++) {
//            System.out.println(print.get(i));
//        }
    }

}
