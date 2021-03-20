package main.剑指offer.面经遇到的;

import java.util.Arrays;

//不同面值的几个硬币，怎么求满足条件的最小值
//322
public class Testmj7 {
    //dp[n] 为总数为n的时候的钱
    //打个比方，1，2，5 和目标11
    //凑成面值为11的最少硬币个数可以由以下三者的最小值得到
    //凑成面值为10的最小硬币数+  =1的这一枚硬币
    //凑成面值为9的最小硬币数+  =2的这一枚硬币
    //凑成面值为6的最小硬币数+  =5的这一枚硬币
    //dp[n] = Math.min(dp[n-1], 1+ dp[amount - coins for(i in len -1)])
    //https://leetcode-cn.com/problems/coin-change/
    //提示：因为要比较的是最小值 ，注意凑不起来的情况
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                }
            }
        }
        if (dp[amount] == amount + 1) {
            return -1;
        }
        return dp[amount];
    }

    public static void main(String args[]) {
        Testmj7 t = new Testmj7();
        int[] a = {1, 2, 5};
        System.out.println(t.coinChange(a, 11));
    }
}
