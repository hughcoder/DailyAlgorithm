package main.Leetcode.动态规划;

import java.util.ArrayList;
import java.util.List;

public class Leet120 {
    //动态规划 解题思路
    //定义二维 dp 数组，将解法二中「自顶向下的递归」改为「自底向上的递推」。
    //2步
    //1、状态定义：
    //dp[i,j]表示从点（i,j）到底边的最小路径和
    //2。状态定义:
    //dp[i][j] = min(dp[i+1][j],dp[i+1][j+1])+triangle[i][j]
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] all = new int[n + 1][n + 1];
        // 从三角形最底下开始遍历  从n往0开始推
        //动态规划需要取到边界值 确保都算到
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                all[i][j] = Math.min(all[i + 1][j], all[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }

        return all[0][0]; // 返回最上层
    }

    // 递归记忆话
    Integer[][] visited;

    public int minimumTotalDFS(List<List<Integer>> triangle) {
        visited = new Integer[triangle.size()][triangle.size()]; // n行n个数
        return dfs(triangle, 0, 0);
    }

    private int dfs(List<List<Integer>> triangle, int i, int j) {
        if (i == triangle.size()) {
            return 0;
        }

        if (visited[i][j] != null) {
            return visited[i][j];
        }
        return visited[i][j] = Math.min(dfs(triangle, i + 1, j), dfs(triangle, i + 1, j + 1)) + triangle.get(i).get(j);
    }

    public static void main(String args[]) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> a0 = new ArrayList<>();
        a0.add(2);
        List<Integer> a1 = new ArrayList<>();
        a1.add(3);
        a1.add(4);
        List<Integer> a2 = new ArrayList<>();
        a2.add(6);
        a2.add(5);
        a2.add(7);
        List<Integer> a3 = new ArrayList<>();
        a3.add(4);
        a3.add(1);
        a3.add(8);
        a3.add(3);
        result.add(a0);
        result.add(a1);
        result.add(a2);
        result.add(a3);
        System.out.println(minimumTotal(result));
    }


}
