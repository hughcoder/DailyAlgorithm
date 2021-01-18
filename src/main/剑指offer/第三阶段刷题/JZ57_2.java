package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;

public class JZ57_2 {

    //输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
    //
    //序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。

    public ArrayList<ArrayList<Integer>> findContinuousSequence(int target) {
        //区间
        int left = 1;
        int right = 2;
        ArrayList<Integer> singleList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> allList = new ArrayList<>();

        while (left<right){
            int sum = (left+right)*(right-left)/2;
            if(sum == target){
                for(int i =left;i<right;i++){
                    singleList.clear();
                    singleList.add(i);
                    allList.add(new ArrayList<>(singleList));
                }
            }else if(sum<target){
                right++;
            }else {
                left++;
            }

        }

        return allList;

    }

    public static void main(String args[]) {
        JZ57_2 jz57 = new JZ57_2();
        System.out.println(jz57.findContinuousSequence(9));
    }

}
