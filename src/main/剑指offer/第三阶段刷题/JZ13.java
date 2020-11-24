package main.剑指offer.第三阶段刷题;

public class JZ13 {

    //这道题两种条件都需要满足  1.行走的距离是连续的 2.距离数字之和小于k
    // 比如k = 3  (0,0) =0 满足 (0,10) =0 也满足

    int mRow;
    int mCol;
    boolean[][] visited;
    int mIndex ;

    public int movingCount(int m, int n, int k) {

        visited = new boolean[m][n];
        mIndex =0;
        mRow = m;
        mCol = n;
        dfs(0, 0,  k);
        return mIndex;
    }

    private void dfs(int start, int end, int k) {
        if(start<0||start>=mRow||end<0||end>=mCol||visited[start][end]||getRealIndex(start)+getRealIndex(end)>k){
            return;
        }
        visited[start][end] = true;
        mIndex++;
        dfs(start+1,end,k);
        dfs(start,end+1,k);
//        visited[start][end] = false;
    }

    private int getRealIndex(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }



    public static void main(String args[]) {
        JZ13 jz13 = new JZ13();
//        System.out.println(jz13.movingCount(2, 3, 1)); //3
//        System.out.println(jz13.movingCount(3, 1, 0)); //1
//        System.out.println(jz13.movingCount(3, 2, 17)); //1
        System.out.println(jz13.movingCount(20, 23, 8)); //
        System.out.println(jz13.movingCount(10, 10, 5)); //
    }
}
