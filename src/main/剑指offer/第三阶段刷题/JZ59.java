package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;

public class JZ59 {
    //给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
    //输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3 //[1  3  -1]
    //输出: [3,3,5,5,6,7]
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0){
            return nums;
        }
        int left = 0;
        int right = k - 1;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = right; i < nums.length; i++) {
            int max = -Integer.MAX_VALUE;
            for (int z = left; z <= right; z++) {
                max = Math.max(nums[z], max);
            }
            list.add(max);
            left++;
            right++;
        }

        int[] target = new int[list.size()];
        for(int i =0 ;i<list.size();i++){
            target[i] = list.get(i);
            System.out.println(target[i]);
        }

        return target;
    }

    public static void main(String args[]) {
        JZ59 jz59 = new JZ59();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(jz59.maxSlidingWindow(nums, 3));
    }
}
