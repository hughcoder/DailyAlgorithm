package main.剑指offer.leetcode极客第二轮;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/solution/20200321438median-by-jasion_han-r/
//放弃了 只能看解析了
public class Leetf438 {
    //滑动窗口 + 字母排序比较
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() == 0 || p.length() == 0) {
            return list;
        }
        int cursize = p.length();
        int l = s.length();
        char[] temp = p.toCharArray();
        Arrays.sort(temp);
        p = new String(temp);

        System.out.println("p------>" + p);

        for (int i = 0; i < l - cursize + 1; i++) {
            String curStr = s.substring(i, cursize + i);
            if (isVaild(curStr, p)) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean isVaild(String cur, String p) {
        String tempStr;
        char[] temp = cur.toCharArray();
        Arrays.sort(temp);
        tempStr = new String(temp);
        return tempStr.equals(p);
    }

    public static void main(String args[]) {
        Leetf438 leetf438 = new Leetf438();
        String s1 = "abab";
        String s2 = "ab";
        System.out.println(leetf438.findAnagrams(s1, s2));
    }
}
