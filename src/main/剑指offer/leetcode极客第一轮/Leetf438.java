package main.剑指offer.leetcode极客第一轮;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetf438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length() - p.length()+1; i++) {
            System.out.println("------>"+s.charAt(i));
            if (isFitAnagrams(s.substring(i, i + p.length()), p)) {
                list.add(i);
            }
        }
        return list;
    }

    public boolean isFitAnagrams(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (String.valueOf(c1).equals(String.valueOf(c2))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Leetf438 leetf438 = new Leetf438();
        String s1 = "abab";
        String s2 = "ab";
        System.out.println(leetf438.findAnagrams(s1, s2));
    }
}
