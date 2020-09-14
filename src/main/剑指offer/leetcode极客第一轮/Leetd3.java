package main.剑指offer.leetcode极客第一轮;

import java.util.ArrayList;
import java.util.HashSet;

public class Leetd3 {
    //给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
    //递归和set
    ArrayList<Integer> list = new ArrayList<>();
    HashSet<Character> hashSet;

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
//        if(s.equals(" ")){
//            return 1;
//        }
        for (int i = 0; i < s.length(); i++) {
            hashSet = new HashSet<>();
            dfs(i, i,s);
        }
        int max = -Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        return max;
    }

    private void dfs(int start, int cur,String s) {
        if (cur == s.length() - 1) {
            if (hashSet.contains(s.charAt(cur))) {
                list.add(cur - start);
                return;
            }
            list.add(cur - start+1);
            return;
        }

        if (hashSet.contains(s.charAt(cur))) {
            list.add(cur - start);
            return;
        }
        hashSet.add(s.charAt(cur));
        dfs(start, cur + 1,s);

    }

    public static void main(String args[]) {
        Leetd3 leetd3 = new Leetd3();
        leetd3.lengthOfLongestSubstring(" ");
        System.out.println(leetd3.list);

    }


}
