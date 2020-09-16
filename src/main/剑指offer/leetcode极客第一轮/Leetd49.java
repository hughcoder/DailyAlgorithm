package main.剑指offer.leetcode极客第一轮;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 1.将字符先排序(排序只能用字符)
// 2.然后根据相同的字符存入hashmap,对于list的结果存入原字符串数组的相应字符串
public class Leetd49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sortStr = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            sortStr[i] = new String(c);
        }

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (int i = 0; i < sortStr.length; i++) {
            if (hashMap.containsKey(sortStr[i])) {
                List<String> list = hashMap.get(sortStr[i]);
                list.add(strs[i]);
                hashMap.put(sortStr[i], list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hashMap.put(sortStr[i], list);
            }
        }

        return new ArrayList<>(hashMap.values());
    }


    public static void main(String args[]) {
        Leetd49 leetd49 = new Leetd49();
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(leetd49.groupAnagrams(str));

    }
}
