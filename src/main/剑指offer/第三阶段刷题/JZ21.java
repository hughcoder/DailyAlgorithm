package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;

public class JZ21 {
    //输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
    //输入：nums = [1,2,3,4]
    //输出：[1,3,2,4]
    //注：[3,1,2,4] 也是正确的答案之一。
    //看看正确答案
    public int[] exchange(int[] nums) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> unEvenList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                //偶数
                evenList.add(nums[i]);
            } else {
                unEvenList.add(nums[i]);
            }
        }
        unEvenList.addAll(evenList);
        int[] a = new int[unEvenList.size()];
        for (int i = 0; i < unEvenList.size(); i++) {
            a[i] = unEvenList.get(i);
        }
        return a;
    }


    public static void main(String args[]) {
        JZ21 jz21 = new JZ21();
        int[] bb = {1, 2, 3, 4}; //1324
        int[] cc = jz21.exchange(bb);
        for (int x : cc) {
            System.out.println("x----->" + x);
        }
    }
}
