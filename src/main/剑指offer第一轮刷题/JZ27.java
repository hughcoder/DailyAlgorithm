package main.剑指offer第一轮刷题;

import java.util.ArrayList;

public class JZ27 {

    //输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
    // 则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。

    static  ArrayList<String> arrayList = new ArrayList<>();
    public static ArrayList<String> Permutation(String str) {
        if(str.length() == 0){
            return new ArrayList<>();
        }
        int start = 0;
        int end = str.length();
        StringBuilder ss = new StringBuilder();
        dfs(str,0,end,ss);
        return arrayList;
    }

    private static void dfs(String str,int level,int end,StringBuilder ss){
        if(ss.length() == end){
            arrayList.add(ss.toString());
            return;
        }
        ss.append(str.charAt(level));
        dfs(str,level+1,end,ss);
        ss.deleteCharAt(level);
    }

    public static void main(String args[]) {
       String str = "abc";
       ArrayList<String> arrayList = Permutation(str);
       for(String a : arrayList){
           System.out.println("--->"+a);
       }
    }
}
