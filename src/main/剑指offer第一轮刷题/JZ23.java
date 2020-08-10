package main.剑指offer第一轮刷题;

import java.util.ArrayList;

//递归 分而治之
public class JZ23 {
//    假设一个二叉搜索树具有如下特征：
//
    //   二叉搜索树定义： 左子树中所有节点的值 < 根节点的值；右子树中所有节点的值 > 根节点的值；
    //   其左、右子树也分别为二叉搜索树。

    //输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
    // 假设输入的数组的任意两个数字都互不相同。

    //后序遍历  13265  左右根 最后一位一定是根结点
    //根据定义右子数所有节点的值>根，所以找到数组第一个大于根节点的数字 就是右子数的开端设置为m
    // i =0,j = num.length-1, m = 4
    //可分成 [i,m-1],[m,j-1]
    // 递归终止条件 i >= j 代表只有一个节点
    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        return recursion(sequence, 0, sequence.length - 1);
    }

    private static boolean recursion(int[] num, int i, int j) {
        if (i >= j) {
            return true;
        }
        //找到右字数跟进点
        int q = i;
        while (num[q] < num[j]) {
            q++;
        }
        int m = q; //右子数根结点
        while (num[q] > num[j]) {
            q++;
        }

        return q == j && recursion(num, i, m - 1) && recursion(num, m, j - 1);

    }

    public static void main(String args[]) {
        int a[] = {1, 3, 2, 6, 5};
        System.out.println(VerifySquenceOfBST(a));
    }

}
