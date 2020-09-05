package main.剑指offer.牛客第一轮刷题;

import java.util.ArrayList;

public class JZ19 {

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList();
        int rows = matrix.length;
        if (rows == 0) {
            return arrayList;
        }
        int columns = matrix[0].length;
        boolean[][] visited = new boolean[rows][columns];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int total = rows * columns;
        int row = 0, column = 0;
        int directionIndex = 0;//控制方向的
        for (int i = 0; i < total; i++) {
            arrayList.add(matrix[row][column]);
            visited[row][column] = true;
            int nextRow = row + directions[directionIndex][0];
            int nextCol = column + directions[directionIndex][1];
            if(nextRow<0||nextRow>=rows||nextCol<0||nextCol>=columns||visited[nextRow][nextCol]){
                directionIndex = (directionIndex+1)%4;
            }
            row+=directions[directionIndex][0];
            column+=directions[directionIndex][1];

        }
        return arrayList;
    }



    public static void main(String args[]) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList<Integer> bb = printMatrix(a);
        for (int x : bb) {
            System.out.println("---->" + x);
        }
    }

}