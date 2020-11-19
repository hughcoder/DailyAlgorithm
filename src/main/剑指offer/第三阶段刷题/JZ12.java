package main.剑指offer.第三阶段刷题;

import main.剑指offer.牛客第一轮刷题.JZ65;

//矩阵中的路径
public class JZ12 {
    //递归遍历
    boolean visited[][];
    String mWord;
    int[][] derections = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        mWord = word;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                visited = new boolean[row][col]; // 这里每次都要重置
                if (dfs(board, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int row, int col, int index) {
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || visited[row][col] || board[row][col] != mWord.charAt(index)) {
            return false;
        }
        visited[row][col] = true;
        if (mWord.length() - 1 == index) {
            return true;
        }

        return dfs(board, row + 1, col, index + 1) || dfs(board, row - 1, col, index + 1) ||
                dfs(board, row, col + 1, index + 1) || dfs(board, row, col - 1, index + 1);
    }

    public static void main(String args[]) {
        JZ12 jz65 = new JZ12();
        char[] a = {'A', 'B', 'C', 'E', 'S', 'F', 'C', 'S', 'A', 'D', 'E', 'E'};
        char[] test = {'A', 'B', 'C', 'C', 'E', 'D'};
        char[][] aa = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String str = String.valueOf(test);

        char[][] cc = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        String target = "ABCESEEEFS";

        System.out.println(jz65.exist(aa, str));
        System.out.println(jz65.exist(cc, target));
    }
}
