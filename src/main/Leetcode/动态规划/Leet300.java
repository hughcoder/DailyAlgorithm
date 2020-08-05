package main.Leetcode.动态规划;

//输入: [10,9,2,5,3,7,101,18]
//输出: 4
//解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
public class Leet300 {
    public static int lengthOfLIS(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        int max = 1;
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }

        return max;

    }

    public static void main(String args[]) {
        int a[] = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(a));
    }
}
