package main.剑指offer.leetcode极客第一轮;

public class Leetm123 {
    //你最多可以完成 两笔 交易。
    public int maxProfit(int[] prices) {
        //这道题有四种状态，第一次买入，第一次卖出，第二次买入，第二次卖出

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
        Leetm123 leetm123 = new Leetm123();
        int[] a = {3, 3, 3, 0, 0, 3,1,4};
        System.out.println(leetm123.maxProfit(a));
    }
}
