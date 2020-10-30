package main.剑指offer.leetcode极客第二轮;

import java.util.Arrays;

public class Leetm322 {
    //给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
    // 如果没有任何一种硬币组合能组成总金额，返回 -1。
    //你可以认为每种硬币的数量是无限的。
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1]; // 重0开始 意思到x元用硬币对应的最小值
        dp[0] = 0;
        for (int i = 1; i < coins.length; i++) {
   

        }
    }

    public static void main(String args[]) {
        int[] a = {1, 2, 5};
        Leetm322 Leetm300 = new Leetm322();

    }
}
