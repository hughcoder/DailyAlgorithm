package main.剑指offer.面经遇到的;

public class Test {
    public int change(int amount, int[] coins) {
        int len = coins.length;
        if (len == 0) {
            if (amount == 0) {
                return 1;
            }
            return 0;
        }
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = coins[0]; i <= amount; i += coins[0]) {
            dp[i] = 1;
        }
        for (int i = 1; i < len; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }

    public static void main(String args[]) {
        Test t = new Test();
        int[] a = {1, 2, 5};
        System.out.println(t.change(5, a));
    }
}
