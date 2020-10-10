package main.剑指offer.leetcode极客第一轮;

//714. 买卖股票的最佳时机含手续费
//给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
public class Leetm714 {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];

        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i] - fee);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }

        return dp[n - 1][0];

    }

    public static void main(String args[]) {
        int[] a = {1, 3, 7, 5, 10, 3};
        Leetm714 leetm714 = new Leetm714();
        System.out.println(leetm714.maxProfit(a, 3));
    }
}
