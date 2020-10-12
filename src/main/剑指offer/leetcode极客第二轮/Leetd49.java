package main.剑指offer.leetcode极客第二轮;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Leetd49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] newStr = new String[strs.length];
        List<List<String>> allList = new ArrayList<>();
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] single = strs[i].toCharArray();
            Arrays.sort(single);
            newStr[i] = Arrays.toString(single);
        }

        for (int i = 0; i < strs.length; i++) {
            if (hashMap.containsKey(newStr[i])) {
                List<String> list = hashMap.get(newStr[i]);
                list.add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hashMap.put(newStr[i], list);
                allList.add(list);
            }
        }

        return allList;

    }

    public static void main(String args[]) {
        Leetd49 leetd49 = new Leetd49();
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(leetd49.groupAnagrams(str));

    }
}
