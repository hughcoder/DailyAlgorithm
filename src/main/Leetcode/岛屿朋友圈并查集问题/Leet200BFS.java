package main.Leetcode.岛屿朋友圈并查集问题;

import java.util.LinkedList;
import java.util.Queue;

public class Leet200BFS {
    private static boolean[][] visited;
    static int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    static int rows;
    static int col;

    public static int numIslands(char[][] grid) {

        rows = grid.length;
        if (rows == 0) {
            return 0;
        }
        col = grid[0].length;

        visited = new boolean[rows][col];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    count++;
                    Queue<Integer> queue = new LinkedList<Integer>();
                    int cur = i * col + j;
                    queue.add(cur);
                    while (!queue.isEmpty()) {
                        int current = queue.poll();
                        int curX = current / col;
                        int curY = current % col;

                        for (int k = 0; k < directions.length; k++) {
                            int newX = curX + directions[k][0];
                            int newY = curY + directions[k][1];

                            if (isInArea(newX, newY) && grid[newX][newY] == '1' && !visited[newX][newY]) {
                                queue.add(newX * col + newY);
                                visited[newX][newY] = true;
                            }
                        }

                    }
                }

            }
        }

        return count;
    }


    private static boolean isInArea(int i, int j) {
        return i >= 0 && j >= 0 && i < rows && j < col;
    }

    public static void main(String args[]) {
        char[][] a = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        System.out.println(numIslands(a));
    }
}
