package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;

public class JZ29 {

    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};//右下左上  //左边是行 右边是列！！
    boolean[][] visited;
    int count;
    int mRow;
    int mCol;
    int[][] mMatrix;
    int mDirectionIndex = 0;

    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0){
            return new int[0];
        }
        int row = matrix.length;
        int col = matrix[0].length;
        mRow = row;
        mCol = col;
        int[] a = new int[row * col];
        count = a.length;
        visited = new boolean[row][col];
        mMatrix = matrix;
        dfs(0, 0, 0, a);
        return a;
    }

    private void dfs(int start, int col, int index, int[] a) {
//        System.out.println("index----->" + index);
        if (count == index) {
            //结束
            return;
        }
        System.out.println("current start----->" + start + "-end-->" + col);
        a[index] = mMatrix[start][col];
        visited[start][col] = true;
        int newStart = start + directions[mDirectionIndex][0];
        int newCol = col + directions[mDirectionIndex][1];
        if (newStart < 0 || newCol < 0 || newStart >= mRow || newCol >= mCol || visited[newStart][newCol]) {
            mDirectionIndex = (mDirectionIndex + 1) % 4;
            System.out.println("mDirectionIndex-->" + mDirectionIndex);
        }
        newStart = start + directions[mDirectionIndex][0];
        newCol = col + directions[mDirectionIndex][1];
        dfs(newStart, newCol, index + 1, a);
    }

    public int[] spiralOrder2(int[][] matrix) {

        int rows = matrix.length;
        if(matrix.length == 0){
            return new int[0];
        }
        int columns = matrix[0].length;
        int[] a = new int[rows*columns];
        boolean[][] visited = new boolean[rows][columns];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int total = rows * columns;
        int row = 0, column = 0;
        int directionIndex = 0;//控制方向的
        for (int i = 0; i < total; i++) {
            a[i] = matrix[row][column];
            visited[row][column] = true;
            int nextRow = row + directions[directionIndex][0];
            int nextCol = column + directions[directionIndex][1];
            if(nextRow<0||nextRow>=rows||nextCol<0||nextCol>=columns||visited[nextRow][nextCol]){
                directionIndex = (directionIndex+1)%4;
            }
            row+=directions[directionIndex][0];
            column+=directions[directionIndex][1];

        }
        return a;
    }

    public static void main(String args[]) {
        JZ29 jz29 = new JZ29();
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] bb = jz29.spiralOrder(a);
        for (int x : bb) {
            System.out.println("---->" + x);
        }
    }
}
