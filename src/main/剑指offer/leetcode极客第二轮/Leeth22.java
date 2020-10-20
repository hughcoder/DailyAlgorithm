package main.剑指offer.leetcode极客第二轮;

import java.util.ArrayList;
import java.util.List;

public class Leeth22 {
    //数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
    private List<String> strList;

    public List<String> generateParenthesis(int n) {
        strList = new ArrayList<>();
        dfs(n, n, "");
        return strList;
    }

    private void dfs(int left, int right, String str) {
        if (left == 0 && right == 0) {
            strList.add(str);
            return;
        }

        if (left > right) {
            return;
        }

        if (left > 0) {
            dfs(left - 1, right, str + "(");
        }

        if (right > 0) {
            dfs(left, right - 1, str + ")");
        }

    }


    public static void main(String args[]) {
        Leeth22 leeth22 = new Leeth22();
        System.out.println(leeth22.generateParenthesis(3));
    }
}
