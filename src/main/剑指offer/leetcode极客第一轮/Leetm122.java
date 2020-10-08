package main.剑指offer.leetcode极客第一轮;

public class Leetm122 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                sum = sum + prices[i] - prices[i - 1];
            }
        }
        return sum;
    }
}
