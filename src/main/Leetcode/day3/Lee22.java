package main.Leetcode.day3;


import main.Leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
//还未理解
public class Lee22 {

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        gen("", result, n, n);
        List<String> realResult = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            if (isVaild(result.get(i))) {
                realResult.add(result.get(i));
            }
        }
        return realResult;
    }

    //遍历所有可能
    public static void gen(String sublist, List<String> result, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(sublist);
            return;
        }

        if (left > 0) {
            gen(sublist + "(", result, left - 1, right);
        }

        if (right > 0) {
            gen(sublist + ")", result, left, right - 1);
        }
    }

    //是否合法
    public static boolean isVaild(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        List<String> result = generateParenthesis(3);
        System.out.println("大小---->" + result.size());
        for (String x : result) {
            System.out.println("---->" + x);
        }
    }
}
