package main.剑指offer.leetcode极客第二轮;

public class Leetm152 {
    //给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
    //存在负数 意味着还需要在维护最大值的同时还要维护最小值
    public int maxProduct(int[] nums) {
        int Max = -Integer.MAX_VALUE; //纵观全局的变量

        int imax = 1;//每次走动时记录那个位置的最大值
        int imin = 1;//每次走动时记录那个位置的最小值

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(imax * nums[i], nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);

            Max = Math.max(imax,Max);

        }
        return Max;


    }

    public static void main(String args[]) {

    }
}
