package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class JZ38 {
    //输入一个字符串，打印出该字符串中字符的所有排列。
    //输入：s = "abc"
    //输出：["abc","acb","bac","bca","cab","cba"]

    List<String> list = new ArrayList<>();
    char[] temp;

    public String[] permutation(String s) {

        temp = s.toCharArray();
        System.out.println(temp.length);
        dfs(0);
        String[] a = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }

        return a;
    }

    private void dfs(int index) {
        //终止条件
        if (index == temp.length - 1) {
            list.add(String.valueOf(temp));
            return;
        }
        HashSet<Character> hashSet = new HashSet();
        for (int i = index; i < temp.length; i++) {
            if (hashSet.contains(temp[i])){
                continue;
            }
            hashSet.add(temp[i]);
            swap(i, index);
            dfs( index + 1);
            swap(i, index);
        }

    }

    private void swap(int i, int index) {
        char tempChar = temp[i];
        temp[i] = temp[index];
        temp[index] = tempChar;
    }

    public static void main(String args[]) {
        JZ38 jz38 = new JZ38();
        String[] bb = jz38.permutation("abc");
        System.out.println(bb.length);
    }
}
