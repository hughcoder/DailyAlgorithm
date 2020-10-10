package main.剑指offer.leetcode极客第一轮;

public class Leetm188 {
    //设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。
    //
    //注意: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
    //三阶动态规划

    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        if (k == 0 || len < 2) {
            return 0;
        }
        if (k > len / 2) {
            return greedy(prices);
        }
        //动态规划部分 3阶
        //状态方程定义
        int[][][] dp = new int[len][k][2]; //len代表第n天价格，k代表交易了k次,2代表持股状态 只有0和1 0代表不持股 1代表持股

        //初始化
        // 初始化：把持股的部分都设置为一个较大的负值
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < k; j++) {
                dp[i][j][1] = -9999;
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < k; j++) {
                if (i == 0) {
                    //代表第0天开始 有两种状态 肯能持股或者不持股
                    dp[i][j][1] = -prices[0];
                    dp[i][j][0] = 0;
                } else {
                    if (j == 0) {
                        //第一次交易
                        dp[i][j][1] = Math.max(dp[i - 1][j][1], -prices[i]);
                        dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                    } else {
                        dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);//买的话说明开始一次交易需要减
                        dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);

                    }
                }
            }
        }

        return dp[len - 1][k - 1][0];

    }

    public int greedy(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int a[] = {2, 4, 1};
        Leetm188 leetm188 = new Leetm188();
        System.out.println(leetm188.maxProfit(2, a));
    }
}
