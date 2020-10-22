package main.剑指offer.leetcode极客第二轮;

import java.util.List;

public class Leetm120 {
    //一把过了 虽然感觉还是很不熟
    public int minimumTotal(List<List<Integer>> triangle) {
        int length = triangle.size();
        int[][] dp = new int[length][length];
        //自底向上  不需要考虑边界值问题
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (i == length - 1) {
                    //初始化
                    dp[i][j] = triangle.get(i).get(j);
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
                }
            }
        }

        return dp[0][0];

    }


}
