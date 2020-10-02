package main.剑指offer.leetcode极客第一轮;

import java.util.*;

//减枝问题 N皇后问题 其实和51完全一样的 两个做其中一题就行了
public class Leeti52 {

    public int totalNQueens(int n) {
        List<List<String>> list = solveNQueens(n);
        return list.size();
    }

    Set<Integer> col; //竖直 每一列
    Set<Integer> pie;
    Set<Integer> na;
    int n;
    List<List<String>> allList;

    public List<List<String>> solveNQueens(int n) {
        col = new HashSet<>();
        pie = new HashSet<>();
        na = new HashSet<>();
        this.n = n;
        allList = new ArrayList<>();
        Deque<Integer> queue = new LinkedList<>();
        dfs(0, queue);
        return allList;
    }

    // level对应每次往下走一行
    private void dfs(int level, Deque<Integer> path) {
        //递归终止条件
        if (level == n) {
            //获取一个结果
            System.out.println(1);
            List<String> board = new ArrayList<>();
            for (Integer key : path) {
                StringBuilder row = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    row.append(".");
                }
                row.replace(key, key + 1, "Q");
                board.add(row.toString());
            }
            allList.add(new ArrayList<>(board));
            return;
        }
        //递归流程 需要判断每一列
        for (int i = 0; i < n; i++) {
            if (!col.contains(i) && !pie.contains(i + level) && !na.contains(i - level)) {
                col.add(i);
                pie.add(i + level);
                na.add(i - level);
                path.add(i);
                dfs(level + 1, path);
                //递归恢复
                path.removeLast();
                col.remove(i);
                pie.remove(i + level);
                na.remove(i - level);
            }
        }
    }
}
