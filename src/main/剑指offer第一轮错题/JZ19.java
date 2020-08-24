package main.剑指offer第一轮错题;

import java.util.ArrayList;

//递归

public class JZ19 {
    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int directionIndex = 1;// 1,2,3,4
    boolean[][] visited;
    private int size = 0;

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        int row = matrix.length;
        if (row == 0) {
            return new ArrayList<>();
        }
        int col = matrix[0].length;
        size = row * col;
        visited = new boolean[row][col];
        ArrayList<Integer> list = new ArrayList<>();
        recur(0, 0, list, matrix);
        return list;
    }

    private void recur(int row, int col, ArrayList<Integer> list, int[][] martix) {
        if (list.size() == size) {
            return;
        }
        visited[row][col] = true;
        list.add(martix[row][col]);
        int newRow = row + directions[directionIndex - 1][0];
        int newCol = col + directions[directionIndex - 1][1];
        if (newRow < 0 || newRow > martix.length - 1 || newCol < 0 || newCol > martix[0].length - 1 || visited[newRow][newCol]) {
            directionIndex++;
            if (directionIndex > 4) {
                directionIndex = directionIndex % 4;
            }
            newRow = row + directions[directionIndex - 1][0];
            newCol = col + directions[directionIndex - 1][1];
            recur(newRow, newCol, list, martix);
        } else {
            recur(newRow, newCol, list, martix);
        }


    }

    public static void main(String args[]) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        JZ19 jz19 = new JZ19();
        ArrayList<Integer> bb = jz19.printMatrix(a);
        for (int x : bb) {
            System.out.println("---->" + x);
        }
    }


}
