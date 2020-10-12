package main.剑指offer.leetcode极客第一轮;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class Leetn200 {
    //dfs 遍历
    boolean visited[][];
    int row;
    int col;
    char[][] grida;
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int numIslands(char[][] grid) {
        row = grid.length;
        if(row == 0){
            return 0;
        }
        col = grid[0].length;
        grida = grid;
        visited = new boolean[row][col];
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    count++;
                    dfs(i, j);
                }
            }
        }
        return count;
    }

    private void dfs(int startRow, int startCol) {
        //每次标记一整块陆地
        visited[startRow][startCol] = true;
        for (int i = 0; i < directions.length; i++) {
            int newRow = startRow + directions[i][0];
            int newCol = startCol + directions[i][1];
            if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < col && !visited[newRow][newCol] && grida[newRow][newCol] == '1') {
                dfs(newRow, newCol);
            }
        }

    }

    public static void main(String args[]) {
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};


        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};


        Leetn200 leetn200 = new Leetn200();
        System.out.println(leetn200.numIslands(grid1));
        System.out.println(leetn200.numIslands(grid2));
    }
}
