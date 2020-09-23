package main.剑指offer.leetcode极客第一轮;

import java.util.ArrayList;
import java.util.List;

//对应ppt13广度优先深度优先 bfs 和 dfs
public class Leeth22 {
    //数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
    //dfs 递归加剪枝     同样的我们也可以想还有多少没有用或者用了多少
    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        //n代表n对括号，即有n个左括号 n个右括号
        dfs("", n, n, list);
        return list;
    }

    public void dfs(String str, int left, int right, List<String> list) {
        //递归终止条件
        if (left == 0 && right == 0) {
            list.add(str);
            return;
        }

        //将左边括号剩余数量小于右边括号数量的做剪枝
        if (left > right) {
            return;
        }

        //递归过程 这边遍历出所有肯能性
        if (left > 0) {
            dfs(str + "(", left - 1, right, list);
        }
        if (right > 0) {
            dfs(str + ")", left, right - 1, list);
        }
    }

    //题解2 BFS



    public static void main(String args[]) {
        Leeth22 leeth22 = new Leeth22();
        System.out.println(leeth22.generateParenthesis(2));
    }

}
