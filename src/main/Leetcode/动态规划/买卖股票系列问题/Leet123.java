package main.Leetcode.动态规划.买卖股票系列问题;


import java.util.ArrayList;
import java.util.List;

//给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
//        设计一个算法来计算你所能获取的最大利润。你最多可以完成 两笔 交易。
public class Leet123 {
    public static int maxProfit(int[] prices) {
        int hold1 = -Integer.MAX_VALUE;
        int release1 = 0;
        int hold2 = -Integer.MAX_VALUE;
        int release2 = 0;


        for (int i = 0; i < prices.length; i++) {
            hold1 = Math.max(hold1, -prices[i]);
            release1 = Math.max(release1, hold1 + prices[i]);
            hold2 = Math.max(hold2, release1 - prices[i]);
            release2 = Math.max(release2, hold2 + prices[i]);
        }

        return release2;

    }

    public static void main(String args[]) {
//        int a[] = {3, 3, 5, 0, 0, 3, 1, 4};
        int a[] = {1,2,3,4,5};
        System.out.println(maxProfit(a));
    }
}
