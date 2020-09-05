package main.剑指offer.牛客第一轮错题Re;

public class JZ23 {
    //输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则返回true,否则返回false。假设输入的数组的任意两个数字都互不相同。
    //递归
    public boolean VerifySquenceOfBST(int[] sequence) {
       if(sequence.length == 0){
           return false;
       }
       return recur(sequence);
    }

    private boolean recur(int[] sequence){
        if (sequence.length == 0) {
            return true;
        }
        if (sequence.length == 1) {
            //遍历结束
            return true;
        }
        int curRoot = sequence[sequence.length - 1];
        int index = sequence.length - 1;

        for (int i = 0; i < sequence.length ; i++) {
            //找到第一个大于根的树,即找右子树首个
            if (sequence[i] > curRoot) {
                index = i;
                break;
            }
            //如果没找到呢
        }
        //根据上述 左子树都小于根 接下来判断右字数是否都大于根
        for (int i = index; i < sequence.length - 1; i++) {
            if (sequence[i] < curRoot) {
                return false;
            }
        }
        int[] left = new int[index];
        int[] right = new int[sequence.length - index - 1];
        for (int i = 0; i < sequence.length - 1; i++) {
            if (i < index) {
                left[i] = sequence[i];
            } else {
                right[i - index] = sequence[i];
            }
        }
        return recur(left) && recur(right);
    }

    public static void main(String args[]) {
        JZ23 jz23 = new JZ23();
        int[] a = {4, 6, 7, 5};
        System.out.println(jz23.VerifySquenceOfBST(a));
    }
}
