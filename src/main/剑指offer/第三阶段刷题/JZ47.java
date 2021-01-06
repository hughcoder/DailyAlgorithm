package main.剑指offer.第三阶段刷题;

public class JZ47 {

    //在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。
    // 你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。
    // 给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？

    public int maxValue(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int dp[][] = new int[row][col];
        dp[0][0] = grid[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j == 0) {
                    dp[0][0] = grid[0][0];
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j] + grid[i][j], dp[i][j - 1] + grid[i][j]);
                }
            }
        }
        return dp[row - 1][col - 1];
    }

    public static void main(String args[]) {
        JZ46 jz46 = new JZ46();
        System.out.println(jz46.translateNum(25));
    }

}
