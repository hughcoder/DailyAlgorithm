package main.剑指offer.leetcode极客第一轮;

import java.util.Arrays;

public class Leetm322 {
    //给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
    // 如果没有任何一种硬币组合能组成总金额，返回 -1。
    //你可以认为每种硬币的数量是无限的。
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        // 注意：因为要比较的是最小值，这个不可能的值就得赋值成为一个最大值
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    // 转化为各种情况子问题的最优解
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String args[]) {
        int[] a = {1, 2, 5};
        Leetm322 Leetm300 = new Leetm322();
        System.out.println(Leetm300.coinChange(a, 11));
    }
}
