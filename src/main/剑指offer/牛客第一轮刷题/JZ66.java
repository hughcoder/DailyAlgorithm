package main.剑指offer.牛客第一轮刷题;

//地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
// 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
// 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
public class JZ66 {
    boolean visited[][];
    int allrow;
    int allcol;
    int count = 0;

    public int movingCount(int threshold, int rows, int cols) {
        allrow = rows;
        allcol = cols;
        visited = new boolean[rows][cols];
        BFS(0, 0, threshold);
        return count;
    }

    private void BFS(int row, int col, int threshold) {
        if (row < 0 || col < 0 || row >= allrow || col >= allcol || visited[row][col]) {
            return;
        }
        if (bitSum(row) + bitSum(col) <= threshold) {
            visited[row][col] = true;
            count++;
            BFS(row + 1, col, threshold);
            BFS(row, col + 1, threshold);
        }
    }

    private int bitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


    public static void main(String args[]) {
        JZ66 jz66 = new JZ66();
        System.out.println(jz66.movingCount(5, 10, 10));
    }


}
