package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;

public class JZ17 {
    //输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
    //输入: n = 1
    //输出: [1,2,3,4,5,6,7,8,9]
    public int[] printNumbers(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum *= 10;
        }
        System.out.println("sum------->" + sum);
        int[] a = new int[sum-1];
        for (int i = 1; i < sum; i++) {
            a[i - 1] = i;
        }
        return a;
    }

    public static void main(String args[]) {
        JZ17 jz17 = new JZ17();
        System.out.println(jz17.printNumbers(1).toString());
    }


}
