package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;

public class JZ29 {

    int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};//右下左上
    boolean[][] visited;
    int count;
    int mRow;
    int mCol;
    int[][] mMatrix;
    int mDirectionIndex = 0;

    public int[] spiralOrder(int[][] matrix) {
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
        if (start < 0 || col < 0 || start >= mRow || col >= mCol || visited[start][col]) {
            mDirectionIndex = (mDirectionIndex + 1) % 4;
        }

        if (count == index) {
            //结束
            return;
        }


        a[index] = mMatrix[start][col];
        System.out.println("index----->"+index);
        visited[start][col] = true;
        int newStart = directions[mDirectionIndex][0];
        int newCol = directions[mDirectionIndex][1];
        dfs(newStart, newCol, index + 1, a);

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
