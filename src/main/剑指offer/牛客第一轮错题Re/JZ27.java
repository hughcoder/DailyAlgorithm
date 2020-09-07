package main.剑指offer.牛客第一轮错题Re;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class JZ27 {
    ArrayList<String> list = new ArrayList<>();
    char[] arr;

    public ArrayList<String> Permutation(String str) {
        arr = str.toCharArray();
        dfs(0);
        Collections.sort(list);
        return list;
    }

    private void dfs(int index) {
        //递归终止条件
        if (index == arr.length - 1) {
            list.add(String.valueOf(arr));
            return;
        }

        HashSet<Character> set = new HashSet<>();
        for (int i = index; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                //这里不能return 如果重复 往下一个元素遍历下去
                continue;
            }
            set.add(arr[i]);
            //交换
            swap(index, i);
            dfs(index + 1);
            //还原
            swap(index, i);
        }
    }
    private void swap(int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String args[]) {
        JZ27 jz27 = new JZ27();
        System.out.println(jz27.Permutation("aab"));

    }

}
