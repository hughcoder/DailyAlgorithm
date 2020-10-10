package main.剑指offer.leetcode极客第一轮;

public class Leetm309 {
    //309. 最佳买卖股票时机含冷冻期
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len == 0){
            return 0;
        }
        int[][] dp = new int[len][3];
        //初始化
        dp[0][0] = 0;//不持股
        dp[0][1] = -prices[0];
        dp[0][2] = 0;//冷冻期

        for (int i = 1; i < len; i++) {
            //递推方程
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][2] - prices[i]);
            dp[i][2] = dp[i-1][0];

        }
        return Math.max(dp[len - 1][0], dp[len - 1][2]);
    }
}
