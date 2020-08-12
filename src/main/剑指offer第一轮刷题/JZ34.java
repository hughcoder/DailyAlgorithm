package main.剑指offer第一轮刷题;

import java.util.HashMap;

public class JZ34 {
//在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
// 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.get(str.charAt(i)) == null) {
                hashMap.put(str.charAt(i), 1);
            } else {
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (hashMap.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

}
