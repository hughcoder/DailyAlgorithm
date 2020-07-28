package main.Leetcode.动态规划;

import main.Leetcode.二分查找.FindSerach;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leet70 {
//    public static int climbStairs(int n) {
//        int sum = 0;
//        Map<Integer, Integer> map = new HashMap();
//        if (n == 1) {
//            return 1;
//        } else if (n == 2) {
//            return 2;
//        } else {
//
//            sum = climbStairs(n - 1) + climbStairs(n - 2);
//        }
//
//        return sum;
//    }

    // DP正推
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] num = new int[n];
        num[0] = 1;
        num[1] = 2;
        for (int i = 2; i < n; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
        return num[n - 1];
    }


    public static void main(String args[]) {
        System.out.println(climbStairs(4));
    }


}
