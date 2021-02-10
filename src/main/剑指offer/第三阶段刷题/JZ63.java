package main.剑指offer.第三阶段刷题;

public class JZ63 {

    //状态定义：dp[i] 代表以price[i]为结尾的子数组的最大利润
    //状态定义转移方程：题目限定买一次，因此前i日最大利润dp[i] 等于前 i -1 日最大利润dp[i-1]和第i日卖出的最大利润的最大值
    //dp[i]=max(dp[i−1],prices[i]−min(prices[0:i]))

    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for (int i = 0; i < prices.length; i++) {
            cost = Math.min(cost, prices[i]);
            profit = Math.max(profit, prices[i] - cost);
        }
        return profit;
    }
}
