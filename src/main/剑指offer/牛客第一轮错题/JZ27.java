package main.剑指offer.牛客第一轮错题;

import java.util.ArrayList;
import java.util.HashSet;

public class JZ27 {
    //输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
    // 则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
    //按顺序固定第一个字符 依次交换后面的字符
    //第一个固定字符（n种情况）（考虑固定第二个字符，第二个字符本身，或者第二个和第三个交换，
    // 或者第二个和第四个字符交换，如果只考虑第二个位置，其实相当于将剩余情况依次放入第二个里面，重复不换能排重）

    ArrayList<String> allList;
    char[] c;

    public ArrayList<String> Permutation(String str) {
        allList = new ArrayList<>();
        if (str.length() == 0) {
            return allList;
        }
        c = str.toCharArray();
        recur(0);
        return allList;
    }

    private void recur(int index) {
        if (c.length - 1 == index) {
            allList.add(String.valueOf(c));
            return;
        }
        //需要一个来判重 相同字符不换  //为了防止同一层递归出现重复元素
        HashSet<Character> hashSet = new HashSet<>();//每一轮固定进行判断
        //这里就很巧妙了,第一层可以是a,b,c那么就有三种情况，这里i = x,正巧dfs(0)，正好i = 0开始
        // 当第二层只有两种情况，dfs(1）i = 1开始
        for (int i = index; i < c.length; i++) {
            if (hashSet.contains(c[i])) continue;
            hashSet.add(c[i]);
            //交换元素，这里很是巧妙，当在第二层dfs(1),x = 1,那么i = 1或者 2， 要不是交换1和1，要不交换1和2
            swap(i, index);
            //进入下一层递归
            recur(index + 1);
            //返回时交换回来，这样保证到达第1层的时候，一直都是abc。这里捋顺一下，开始一直都是abc，那么第一位置总共就3个位置
            //分别是a与a交换，这个就相当于 x = 0, i = 0;
            //     a与b交换            x = 0, i = 1;
            //     a与c交换            x = 0, i = 2;
            //就相当于上图中开始的三条路径
            //第一个元素固定后，每个引出两条路径,
            //     b与b交换            x = 1, i = 1;
            //     b与c交换            x = 1, i = 2;
            swap(index, i);
        }
    }

    private void swap(int i, int index) {
        char temp = c[i];
        c[i] = c[index];
        c[index] = temp;
    }

    public static void main(String args[]) {
        JZ27 jz27 = new JZ27();
        ArrayList<String> result = jz27.Permutation("abc");
        System.out.println(result.toString());

    }
}
