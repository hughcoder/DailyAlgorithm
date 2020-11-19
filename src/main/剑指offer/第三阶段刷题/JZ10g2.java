package main.剑指offer.第三阶段刷题;

public class JZ10g2 {
    //一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
    public int numWays(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return numWays(n - 1) + numWays(n - 2);
        }
    }

    public int numWays2(int n) {
        int[] dp = new int[n + 1];
        if (n <= 1) {
            return 1;
        }
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            dp[i] %= 1000000007;
        }
        return dp[n];

    }

    public static void main(String args[]) {
        JZ10g2 jz10 = new JZ10g2();
        System.out.println(jz10.numWays(2)); //2
        System.out.println(jz10.numWays2(7)); //21
        System.out.println(jz10.numWays(0)); //1
    }
}
