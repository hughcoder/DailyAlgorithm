package main.剑指offer.leetcode极客第一轮;

public class Leetn547 {
    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length]; //一共只有M个人
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                count++;
                dfs(visited, M, i);
            }
        }

        return count;
    }

    private void dfs(int[] visited, int[][] M, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(visited, M, j);
            }
        }
    }

    public static void main(String args[]) {
        int[][] a = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
        Leetn547 leetn547 = new Leetn547();
        System.out.println(leetn547.findCircleNum(a));
    }
}
