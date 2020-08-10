package main.Leetcode.day5;

//给定一个无序的整数数组，找到其中最长上升子序列的长度。

//输入: [10,9,2,5,3,7,101,18]
//输出: 4
//解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。

//解题思路

// 暴力 2的n次方
//dp
//二分插入
public class Leet300 {
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 0; i < n; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (j - 1 >=  0) {
                        dp[j] = Math.max(dp[j - 1], maxval);
                    }
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }

        return maxans;
    }

    public static void main(String args[]) {
        int array[] = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(array));
    }
}
