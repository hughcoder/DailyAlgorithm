package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;
import java.util.List;

public class JZ57_2 {

    //输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
    //
    //序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
    //正整数序列从1开始到N

    public int[][] findContinuousSequence(int target) {
        int left = 1;
        int right = 2;
        int s = 3;
        List<int[]> res = new ArrayList<>();
        while (left<right){
            if(s == target){
                int[] a = new int[right-left+1];
                for(int i =left;i<=right;i++){
                    a[i-left] = i;
                }
                res.add(a);
            }else if(s<target){
                right++;
                s+=right;
            }else {
                s-=left;
                left++;
            }
        }
        return res.toArray(new int[0][]);
    }

    public static void main(String args[]) {
        JZ57_2 jz57 = new JZ57_2();

    }

}
