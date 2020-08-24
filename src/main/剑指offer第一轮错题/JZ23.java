package main.剑指offer第一轮错题;

public class JZ23 {
    //输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。 搜索树 左<根<右
    //https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/solution/mian-shi-ti-33-er-cha-sou-suo-shu-de-hou-xu-bian-6/
    //后序  左右根
    // 5
    //2 6
    // 1  3    //后序遍历 13265
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) {
            return false;
        }

        return recur(0, sequence.length - 1, sequence);
    }

    private boolean recur(int i, int j, int[] num) {
        //终止条件
        if (i >= j) {
            return true;
        }
        int m = i;
        while (num[m] < num[j]) {
            m++;
        }
        int p = m;
        while (num[p] > num[j]) {
            p++;
        }
        return p == j && recur(0, m - 1, num) && recur(m, j-1, num);
    }

    public static void main(String args[]) {
        JZ23 jz23 = new JZ23();
        int[] a = {1, 3, 2, 6, 5};
        int[] b = {1, 6, 3, 2, 5};
        System.out.println(jz23.VerifySquenceOfBST(a));
//        System.out.println(jz23.VerifySquenceOfBST(b));
    }
}
