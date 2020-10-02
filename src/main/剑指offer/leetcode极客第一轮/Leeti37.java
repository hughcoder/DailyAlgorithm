package main.剑指offer.leetcode极客第一轮;

//减枝问题  解数独
public class Leeti37 {
    private boolean row[][];
    private boolean col[][];
    private boolean boxes[][];
    private int l;

    public void solveSudoku(char[][] board) {
        l = board.length;
        row = new boolean[l][l];
        col = new boolean[l][l];
        boxes = new boolean[l][l]; //如何把每小九个数字对应到第一个去坐标里，第二个坐标代表所在数字

    }

    private void dfs(int level, char[][] board) {
        for (int i = 0; i < l; i++) {
            if(board[level][i] == '.'){

            }
        }
    }
}
