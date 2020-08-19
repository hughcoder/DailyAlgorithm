package main.剑指offer第一轮刷题;

public class JZ65 {
    //递归 或者动态规划
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; //上下左右
        boolean visited[][];
        //先构造目标二维数组
        char[][] arr = new char[rows][cols];


        return true;
    }

    public static void main(String args[]) {
        JZ65 jz65 = new JZ65();
        char[] a = {'A', 'B', 'C', 'E', 'S', 'F', 'C', 'S', 'A', 'D', 'E', 'E'};
        char[] test = {'A', 'B', 'C', 'C', 'E', 'D'};

        jz65.hasPath(a, 3, 4, test);
    }
}
