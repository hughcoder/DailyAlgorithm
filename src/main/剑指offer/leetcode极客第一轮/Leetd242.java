package main.剑指offer.leetcode极客第一轮;

import java.util.Arrays;

public class Leetd242 {
    //给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
    //用hashmap 或者 字符串排序
    public boolean isAnagram(String s, String t) {
        if (s.length() == 0 && t.length() == 0) {
            return true;
        }
        if (s.length() != t.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String newStr = new String(s1);
        char[] s2 = t.toCharArray();
        Arrays.sort(s2);
        String newStr2 = new String(s2);
        return newStr.equals(newStr2);
    }
}
