package main.剑指offer.leetcode极客第二轮;

import java.lang.reflect.Array;
import java.util.Arrays;

//300. 最长上升子序列
public class Leetm300 {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int max = 1;
        Arrays.fill(dp,1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) { //每加一个i更新前面所有的i是否满足情况
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
                max = Math.max(dp[i], max);
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int a[] = {10, 9, 2, 5, 3, 7, 101, 18};
        Leetm300 leetm300 = new Leetm300();
        System.out.println(leetm300.lengthOfLIS(a));
    }


}
