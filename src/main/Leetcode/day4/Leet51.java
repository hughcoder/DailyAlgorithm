package main.Leetcode.day4;

import main.Leetcode.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leet51 {


    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }
        Set<Integer> pie = new HashSet<>();
        Set<Integer> na = new HashSet<>();
        dfs(0, n, pie, na, new HashSet<>(), result, new ArrayList<>());
        return result;
    }

    public static void dfs(int level, int n, Set<Integer> pie, Set<Integer> na, Set<Integer> col, List<List<String>> results, List<String> tempList) {
        if (level > n - 1) {
            if (tempList.size() == n) {
                List<String> result = new ArrayList<String>(tempList);
                results.add(result);
            }
            return;
        }

        boolean exists = false;
        //遍历列

        for (int j = 0; j < n; j++) {
            if (pie.contains(level + j) || na.contains(j - level) || col.contains(j)) {
                continue;
            }
            exists = true;
            pie.add(level + j);
            na.add(j - level);
            col.add(j);
            String temp = getStr(n, j);
            tempList.add(temp);
            dfs(level + 1, n, pie, na, col, results, tempList);
            pie.remove(level + j);
            na.remove(j - level);
            col.remove(j);
            tempList.remove(temp);

        }
        if (!exists) {
            return;
        }
    }

    private static String getStr(int n, int j) { //每行确认的q
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == j) {
                stringBuilder.append("Q");
            } else {
                stringBuilder.append(".");
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String args[]) {
//        List<List<String>> resultList = solveNQueens(2);
//        System.out.println(solveNQueens(4));
        System.out.println(solveNQueens(4));
    }
}
