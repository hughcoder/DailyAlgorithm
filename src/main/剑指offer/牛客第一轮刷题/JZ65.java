package main.剑指offer.牛客第一轮刷题;

public class JZ65 {
    //递归
    int allrows = 0;
    int allCols = 0;
    boolean[][] isVisited;

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        //先构造目标二维数组
        allrows = rows;
        allCols = cols;
        char[][] arr = new char[rows][cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = matrix[k];
                k++;
            }
        }
        //每个起点开始遍历
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                isVisited = new boolean[rows][cols];
                if (isSuitDFS(str, 0, arr, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    //初始起点
    private boolean isSuitDFS(char[] str, int level, char[][] arr, int row, int col) {
        //终止条件 （一、是每层遍历判断 ，二、终点判断）
        //不符合return
        if (row < 0 || col < 0 || row >= allrows || col >= allCols || isVisited[row][col] || !(str[level] == arr[row][col])) {
            return false;
        }
        if (str.length-1 == level) {
            return true;
        }

        //当层做处理
        isVisited[row][col] = true;
        //下一层递归 四个方向
        return isSuitDFS(str, level + 1, arr, row + 1, col) ||
                isSuitDFS(str, level + 1, arr, row - 1, col) ||
                isSuitDFS(str, level + 1, arr, row, col + 1) ||
                isSuitDFS(str, level + 1, arr, row, col - 1);
    }

    public static void main(String args[]) {
        JZ65 jz65 = new JZ65();
        char[] a = {'A', 'B', 'C', 'E',
                'S', 'F', 'E', 'S',
                'A', 'D', 'E', 'E'};
//        char[] test = {'A', 'B', 'C', 'C', 'E', 'D'};
//        char[] test = {'A', 'B', 'C', 'C', 'E', 'D'};
        String target = "ABCESEEEFS";
        System.out.println(jz65.hasPath(a, 3, 4, target.toCharArray()));
    }
}
