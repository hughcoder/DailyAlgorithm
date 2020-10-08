package main.剑指offer.leetcode极客第一轮;

import java.util.List;

public class Leetm120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int l = triangle.size();
        int[][] dp = new int[l+1][l+1];
        //自底向上
        for (int i = l-1; i >= 0; i--) {
            for (int j = 0; j<=i; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }
}
