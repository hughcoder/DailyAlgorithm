package main.剑指offer.leetcode极客第一轮;

import java.util.Arrays;

//对应ppt12
//一个小朋友最多只能拥有一块饼干
public class Leetg455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for (int j = 0; j < s.length; j++) {
            if (g[i] <= s[j]) {
                i++;
                if (i == g.length) {
                    return i;
                }
            }
        }
        return i;
    }

    public static void main(String args[]) {
        Leetg455 leetg455 = new Leetg455();
        int[] a1 = {1, 5};
        int[] b = {2, 2, 3};

        System.out.println(leetg455.findContentChildren(a1, b));
    }
}
