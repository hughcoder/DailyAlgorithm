package main.Leetcode.动态规划.买卖股票系列问题;

//给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
//
//设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。
//
//注意: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
//最关键的题目 多看下

public class Leet188 {
    public static int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        if (k >= prices.length / 2)
            return greedy(prices);
        int n = prices.length;
        int[][][] dp = new int[prices.length][k + 1][2];
        for (int i = 0; i <= k; i++) {
            // 第 1 天买入 - 卖出循环 K 次之后不再买入，所以初始值为 0
            dp[0][i][0] = 0;
            // 第 1 天买入 - 卖出循环 K 次之后又买入，所以初始值为 -prices[0]
            dp[0][i][1] = -prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j][0] = j != 0 ? Math.max(dp[i - 1][j][0], dp[i - 1][j - 1][1] + prices[i]) : dp[i - 1][j][0]; //未持有的状态
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j][0] - prices[i]); //持有的状态
            }
        }

        int max = Integer.MIN_VALUE;
        // 遍历k次交易取最大值
        for (int i = 0; i <= k; i++)
            max = Math.max(max, dp[prices.length - 1][i][0]);
        return max;// 最后一天交易k次最大
    }

    private static int greedy(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] > prices[i - 1])
                max += prices[i] - prices[i - 1];
        }
        return max;
    }

    public static void main(String args[]) {
        int a[] = {2, 4, 1};
        System.out.println(maxProfit(2, a));
    }
}
