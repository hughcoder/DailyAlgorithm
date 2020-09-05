package main.剑指offer.牛客第一轮错题;

public class JZ65 {

    int allRow = 0;
    int allCol = 0;
    boolean visited[][];

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (rows == 0) {
            return false;
        }
        allRow = rows;
        allCol = cols;
        char change[][] = new char[rows][cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                change[i][j] = matrix[k];
                k++;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //遍历每一个 数组里当开始位置
                visited = new boolean[rows][cols];//每轮一用
                if (dfs(change, i, j, str, 0)) {
                    return true;
                }
            }
        }

        return false;

    }

    private boolean dfs(char[][] matrix, int startRow, int startCol, char[] str, int index) {
        //终止条件 1.位置不越界 2.且没轮循环没有被访问
        if (startRow < 0 || startCol < 0 || startRow >= allRow || startCol >= allCol || visited[startRow][startCol]) {
            return false;
        }
        if (matrix[startRow][startCol] != str[index]) {
            return false;
        }

        if (index == str.length - 1) {
            return true;
        }
        visited[startRow][startCol] = true;
        //当前层级处理  下一层
        return dfs(matrix, startRow - 1, startCol, str, index + 1) ||
                dfs(matrix, startRow + 1, startCol, str, index + 1) ||
                dfs(matrix, startRow, startCol - 1, str, index + 1) ||
                dfs(matrix, startRow, startCol + 1, str, index + 1);
    }

    public static void main(String args[]) {
        JZ65 jz65 = new JZ65();
        char[] a = {'A', 'B', 'C', 'E', 'S', 'F', 'C', 'S', 'A', 'D', 'E', 'E'};
        char[] test = {'A', 'B', 'C', 'C', 'E', 'D'};

        System.out.println(jz65.hasPath(a, 3, 4, test));
    }
}
