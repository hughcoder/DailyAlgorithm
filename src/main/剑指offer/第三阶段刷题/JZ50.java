package main.剑指offer.第三阶段刷题;

import java.util.HashMap;

public class JZ50 {
    //在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
    public char firstUniqChar(String s) {
        if (s.length() == 0) {
            return ' ';
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == null) {
                hashMap.put(s.charAt(i), 1);
            } else {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String args[]) {
        JZ50 jz50 = new JZ50();
        System.out.println(jz50.firstUniqChar("abaccdeff"));
        System.out.println(jz50.firstUniqChar(""));
    }
}
