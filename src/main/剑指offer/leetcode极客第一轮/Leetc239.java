package main.剑指offer.leetcode极客第一轮;

import java.util.ArrayList;

//239. 滑动窗口最大值  不是最优解
public class Leetc239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int maxValue = -Integer.MAX_VALUE;
            if (k + i <= nums.length) {
                for (int j = i; j < k + i; j++) {
                    if (nums[j] > maxValue) {
                        maxValue = nums[j];
                    }
                }
                list.add(maxValue);
            }
        }
        int[] max = new int[list.size()];
        for (int a = 0; a < list.size(); a++) {
            max[a] = list.get(a);
        }
        return max;
    }

    public static void main(String args[]) {
        Leetc239 stack = new Leetc239();
        int[] a = {1, 3, -1, -3, 5, 3, 6, 7};
        stack.maxSlidingWindow(a, 3);
    }
}
