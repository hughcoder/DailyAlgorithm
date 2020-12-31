package main.剑指offer.第三阶段刷题;

public class JZ42 {
    //连续子数组的最大和
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int max = nums[0];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    public static void main(String args[]) {
        JZ42 jz42 = new JZ42();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(jz42.maxSubArray(nums));

    }
}
