package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;

public class JZ38 {
    //输入一个字符串，打印出该字符串中字符的所有排列。
    //输入：s = "abc"
    //输出：["abc","acb","bac","bca","cab","cba"]
    public String[] permutation(String s) {
        if(s.length() == 0){
            return new String[0];
        }
        ArrayList<String> list = new ArrayList<>();
        dfs(list, s, 0);
        String[] a = (String[]) list.toArray();
        return a;
    }

    private void dfs(ArrayList<String> list, String s, int index) {
        //终止条件
        if(s.length()-1 == index){
            //遍历到最后一步说明结束
            String d = s;
            list.add(d);
        }



    }
}
