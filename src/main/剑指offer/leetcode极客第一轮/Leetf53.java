package main.剑指offer.leetcode极客第一轮;

public class Leetf53 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        //初始值
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
        }
        int max = -Integer.MAX_VALUE;
        for(int i =0;i<dp.length;i++){
            if(dp[i]>max){
                max = dp[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Leetf53 leetf50 = new Leetf53();
        System.out.println(leetf50.maxSubArray(a));

    }
}
