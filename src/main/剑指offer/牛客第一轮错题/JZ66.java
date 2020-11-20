package main.剑指offer.牛客第一轮错题;

public class JZ66 {

    int allRow = 0;
    int allCol = 0;
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int count = 0;
    boolean[][] visited;

    public int movingCount(int threshold, int rows, int cols) {
        if(threshold <=0){
            return 0;
        }

        allRow = rows;
        allCol = cols;
        visited = new boolean[rows][cols];
        dfs(0, 0, threshold);
        return count;
    }

    private void dfs(int curRow, int curCol, int threshold) {
        count++;
        // 终止条件判断
        visited[curRow][curCol] =true;
        //当前层级
        for (int i = 0; i < directions.length; i++) {
            int newRow = curRow + directions[i][0];
            int newCur = curCol + directions[i][1];
            if (newRow >= 0 && newCur >= 0 && newRow < allRow && newCur < allCol
                    && !visited[newRow][newCur] && (addSum(newRow) + addSum(newCur)) <= threshold) {
                dfs(newRow, newCur, threshold);
            }
        }
        //下一层数字做判断
    }

    private int addSum(int num) {
        int sum = 0;
        while (num / 10 != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum + num;
    }
    public static void main(String args[]) {
         JZ66 jz66 = new  JZ66();
        System.out.println(jz66.movingCount(5, 10, 10));
        System.out.println(jz66.movingCount(8,20, 23)); //
    }

}
