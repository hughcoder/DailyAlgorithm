package main.Leetcode.day2;

//122. 买卖股票的最佳时机 II
//贪心算法
//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//
//设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
//
//注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。

public class Leet122 {

    //贪心算法
    public static int maxProfit(int[] prices) {

        int sum = 0;
        System.out.println("prices.length - 1--->"+(prices.length - 1));
        System.out.println("zzz--->"+prices[prices.length - 1]);
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                sum += prices[i + 1] - prices[i];
            }
        }
        return sum;
    }

    //动态规划


    public static void main(String args[]) {
        int[] a = {7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
}
