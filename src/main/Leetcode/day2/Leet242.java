package main.Leetcode.day2;

import main.Leetcode.day1.ListNode;

import java.util.HashMap;

public class Leet242 {
    public static boolean isAnagram(String s, String t) {
        HashMap<String, Integer> map1 = new HashMap<>();
        if (s.equals(t)) {
            return true;
        }
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            String a = String.valueOf(s.charAt(i));
            if (map1.get(a) != null) {
                int count = map1.get(a);
                map1.put(a, count += 1);
            } else {
                map1.put(a, 1);
            }
        }


        for (int i = 0; i < t.length(); i++) {
            String a = String.valueOf(t.charAt(i));
            if (map1.get(a) == null)
                return false;

            int d = map1.get(a);
            d--;
            map1.put(a, d);
            if (d < 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]) {
        System.out.println(isAnagram("aacc", "ccac"));
    }
}
