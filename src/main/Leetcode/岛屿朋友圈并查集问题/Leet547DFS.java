package main.Leetcode.岛屿朋友圈并查集问题;

public class Leet547DFS {
    private static boolean[][] visited;
    static int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    static int rows;
    static int col;

    public static int findCircleNum(int[][] M) {

        rows = M.length;
        if (rows == 0) {
            return 0;
        }
        col = M[0].length;

        visited = new boolean[rows][col];
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (!visited[i][j] && M[i][j] == 1) {  //没被访问过 并且是陆地
                    dfs(i, j, M);
                    count++;
                }
            }
        }
        return count;
    }


    private static void dfs(int i, int j, int[][] grid) {
        visited[i][j] = true;
        visited[j][i] =true;
        //分别向4个方向伸展
        for (int k = 0; k < directions.length; k++) {
            int newX = i + directions[k][0];
            int newY = j + directions[k][1];

            //dfs终止条件
            if (isInArea(newX, newY) && !visited[newX][newY] && grid[i][j] == 1&&grid[j][i]==0 ) {
                dfs(newX, newY, grid);
            }
        }
    }

    private static boolean isInArea(int i, int j) {
        return i >= 0 && j >= 0 && i < rows && j < col;
    }

    public static void main(String args[]) {
        int[][] a = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
        System.out.println(findCircleNum(a));
    }
}
