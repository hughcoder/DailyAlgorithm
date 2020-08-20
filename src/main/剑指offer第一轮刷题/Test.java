package main.剑指offer第一轮刷题;

import main.Leetcode.TreeNode;

import java.util.ArrayList;

public class Test {
    public static void main(String args[]) {
        System.out.println(5e2);
        System.out.println(-1E-16);
    }

    public int movingCount(int level) {
        int count = 0;
        bfs(level, count);
        System.out.println("----->" + count);
        int a =5;
        seta(a);
        System.out.println(a);
        return count;
    }

    private void seta(int c ){
        //传递形参，只是对象的拷贝 对原来数据不做影响
        c =10;
    }

    private void bfs(int level, int count) {
        if (level == 5) {
            return;
        }
        count++;
//        System.out.println("--->" + count);

        bfs(level + 1, count);
    }


}
