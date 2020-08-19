package main.剑指offer第一轮刷题;

import java.util.ArrayList;

public class JZ64 {
    //滑动窗口的最大值
    //给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及
    // 滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的
    // 滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
    // {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
    //窗口大于数组长度的时候，返回空

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> maxList = new ArrayList<>();

        if(size == 0  || num.length == 0){
            return maxList;
        }

        for (int i = 0; i < num.length; i++) {
            int j = i + size - 1;
            if (j > num.length - 1) {
                break;
            }

            int max = -Integer.MAX_VALUE;

            for (int k = i; k <= j; k++) {
                if (num[k] > max) {
                    max = num[k];
                }
            }

            maxList.add(max);


        }

        return maxList;

    }
}
