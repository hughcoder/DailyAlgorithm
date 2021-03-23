package main.剑指offer.第三阶段刷题;

import java.util.HashMap;

public class JZ48 {

    //双指针+hashmap，第一个指针记录左边的索引，第二个指针向右遍历
    //用hashmap记录左指针相同字符的上一个，为区间[j,j]（j为相同字符）及后续不需要+1
    public int lengthOfLongestSubstring(String s) {
        int left = -1; //至少有一个字符
        int max = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                left = Math.max(left, hashMap.get(s.charAt(i)));
            }
            hashMap.put(s.charAt(i), i);
            max = Math.max(i - left, max);
        }
        return max;
    }

    public static void main(String args[]) {
        JZ48 jz48 = new JZ48();
        System.out.println(jz48.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(jz48.lengthOfLongestSubstring("bbbbbb"));
//        System.out.println(jz48.lengthOfLongestSubstring("pwwkew"));
//        System.out.println(jz48.lengthOfLongestSubstring("dvdf"));
    }
}
