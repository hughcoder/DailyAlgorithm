package main.剑指offer.第三阶段刷题;

import java.util.HashMap;

public class JZ10 {

    //递归肯定过不了的
    public int fib2(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib2(n - 1) + fib2(n - 2);
        }
    }
    //递归+记忆化
    //  原理： 在递归法的基础上，新建一个长度为 nn 的数组，用于在递归时存储 f(0)f(0) 至 f(n)f(n) 的数字值，重复遇到某数字则直接从数组取用，
    //  避免了重复的递归计算。
//   缺点： 记忆化存储需要使用 O(N)O(N) 的额外空间。

    private HashMap<Integer, Integer> hashMap = new HashMap<>();

    public int fib1(int n) {
        if (n <= 1) {
            return n;
        } else {

            return fib1(n - 1) + fib1(n - 2);
        }
    }

    //动态规划  数组这里还可以优化  通过常量来计算
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        if(n == 2){
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }

    public static void main(String args[]) {

        JZ10 jz10 = new JZ10();
        System.out.println(jz10.fib2(4));
    }

}
